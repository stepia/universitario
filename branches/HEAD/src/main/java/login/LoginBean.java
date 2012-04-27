package login;

import java.util.ResourceBundle;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.springframework.security.access.annotation.Secured;

import service.IAuthenticationService;

@ManagedBean(name = "loginbean")
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
        boolean isLoggedIn = authenticationService.login(getUsername(), getPassword());
        if (isLoggedIn) {
            isAuthenticated = true;
            return "success";
        }
        FacesContext context = FacesContext.getCurrentInstance();
        ResourceBundle bundle = context.getApplication().getResourceBundle(
                    context, "msg");
        String errorMessage = bundle.getString("loginError");
        FacesContext.getCurrentInstance().addMessage(
                    "form:username",
                    new FacesMessage(FacesMessage.SEVERITY_ERROR, errorMessage, errorMessage));
        return null;

    }

    public boolean isAuthenticated() {
        return isAuthenticated;
    }

    public void setAuthenticated(boolean isAuthenticated) {
        this.isAuthenticated = isAuthenticated;
    }

    @Secured("ROLE_USER")
    public String doLogout() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();

        return "logout";
    }

}
