package web;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

@ManagedBean(name = "language")
@SessionScoped
public class LanguageBean {

    private String localeCode;

    private static Map<String, Object> countries;
    static {
        countries = new LinkedHashMap<String, Object>();
        countries.put("UA", new Locale("ua"));
        countries.put("ENG", new Locale("en"));
        countries.put("RU", new Locale("ru"));

    }

    public Map<String, Object> getCountriesInMap() {
        return countries;
    }

    public String getLocaleCode() {
        if (localeCode == null) {
            localeCode = "ua";
        }
        return localeCode;
    }

    public void setLocaleCode(String localeCode) {
        this.localeCode = localeCode;
    }

    // value change event listener
    public void countryLocaleCodeChanged(ValueChangeEvent e) {

        String newLocaleValue = e.getNewValue().toString();

        // loop country map to compare the locale code
        for (Map.Entry<String, Object> entry : countries.entrySet()) {

            if (entry.getValue().toString().equals(newLocaleValue)) {

                FacesContext.getCurrentInstance()
                            .getViewRoot().setLocale((Locale) entry.getValue());

            }
        }
    }

}