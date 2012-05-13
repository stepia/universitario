package web;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "faculty")
@SessionScoped
public class FacultyBean {

    private String faculty;

    private static Map<String, Object> faculties;
    static {
        faculties = new LinkedHashMap<String, Object>();
        faculties.put("", 1);
        faculties.put("ENG", 2);
        faculties.put("RU", 3);

    }

    public Map<String, Object> getCountriesInMap() {
        return faculties;
    }

    public String getLocaleCode() {
        if (faculty == null) {
            faculty = "";
        }
        return faculty;
    }

    public void setLocaleCode(String faculty) {
        this.faculty = faculty;
    }

}