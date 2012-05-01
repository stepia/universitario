package web;

import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.component.tabview.TabView;
import org.primefaces.event.TabChangeEvent;

import service.IUserManager;

@ManagedBean(name = "mainbean")
@SessionScoped
public class MainBean {

    private int activeTabIndex = 0;
    private String title;
    private IUserManager userManager;

    public MainBean() {
        String user = FacesContext.getCurrentInstance().getExternalContext().getRemoteUser();
        // Person per = getUserManager().getUser(user).getPerson();
        // setTitle(per.getLastName() + " " + per.getFirstName());
    }

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

    public IUserManager getUserManager() {
        return userManager;
    }

    public void setUserManager(IUserManager userManager) {
        this.userManager = userManager;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
