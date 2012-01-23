package security;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import model.UserDetails;


@ManagedBean
@SessionScoped
public class LoginBean {

	private boolean isAuthenticated;

	@ManagedProperty(value = "#{userDetails}")
	private UserDetails userDetails;

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

	public UserDetails getUserDetails() {
		return userDetails;
	}

	@ManagedProperty(value = "#{authenticationService}")
	private transient AuthenticationService authenticationService;

	public void setAuthenticationService(AuthenticationService authenticationService) {
		this.authenticationService = authenticationService;
	}

	public String doLogin() {
		boolean isLoggedIn = authenticationService.login(userDetails.getUsername(), userDetails.getPassword());
		if (isLoggedIn) {
			isAuthenticated = true;
			return "index";
		}
		FacesContext.getCurrentInstance().addMessage("login failure", new FacesMessage());
		return "failureLogin";

	}

	public boolean isAuthenticated() {
		return isAuthenticated;
	}

	public void setAuthenticated(boolean isAuthenticated) {
		this.isAuthenticated = isAuthenticated;
	}

}
