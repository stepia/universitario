package web;

import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.component.tabview.TabView;
import org.primefaces.event.TabChangeEvent;

@ManagedBean(name = "mainbean")
@SessionScoped
public class MainBean {

    private int activeTabIndex = 0;

    public String doAction(String action) {
        return action;
    }

    public void onTabChange(TabChangeEvent event) {
        TabView tabView = (TabView) event.getComponent();
        FacesContext context = FacesContext.getCurrentInstance();
        Map<String, String> params = context.getExternalContext().getRequestParameterMap();
        params.get(tabView.getClientId(context) + "_activeIndex");

    }

    public int getActiveTabIndex() {
        return activeTabIndex;
    }

    public void setActiveTabIndex(int activeTabIndex) {
        this.activeTabIndex = activeTabIndex;
    }
}
