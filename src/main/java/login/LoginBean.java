package login;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.springframework.security.access.annotation.Secured;

import service.IAuthenticationService;

@ManagedBean
@SessionScoped
public class LoginBean {
    @ManagedProperty(value = "#{authenticationService}")
    private transient IAuthenticationService authenticationService;
    private boolean isAuthenticated;
    String username;
    String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAuthenticationService(IAuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    public String doLogin() {
        boolean isLoggedIn = authenticationService.login(username, password);
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

    @Secured("ROLE_USER")
    public String logout() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();

        return "logout";
    }

}
