package login;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import service.IAuthenticationService;
import entry.User;

@ManagedBean
@SessionScoped
public class LoginBean {

    private boolean isAuthenticated;

    @ManagedProperty(value = "#{user}")
    private User user;

    public void setUser(User userDetails) {
        this.user = userDetails;
    }

    public User getUser() {
        return user;
    }

    @ManagedProperty(value = "#{authenticationService}")
    private transient IAuthenticationService authenticationService;

    public void setAuthenticationService(IAuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    public String doLogin() {
        boolean isLoggedIn = authenticationService.login(user.getUsername(), user.getPassword());
        if (isLoggedIn) {
            isAuthenticated = true;
            return "success";
        }
        FacesContext.getCurrentInstance().addMessage(
                    "form:username",
                    new FacesMessage(FacesMessage.SEVERITY_ERROR, "Wrong username or password",
                                "Wrong username or password"));
        return null;

    }

    public boolean isAuthenticated() {
        return isAuthenticated;
    }

    public void setAuthenticated(boolean isAuthenticated) {
        this.isAuthenticated = isAuthenticated;
    }

}
