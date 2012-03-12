package user;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

import service.UserManager;
import entry.User;

@ManagedBean
@SessionScoped
public class UserAction {

	@ManagedProperty(value = "#{user}")
	private User user;
	@ManagedProperty(value = "#{userManager}")
	private UserManager userManager;

	public UserManager getUserManager() {
		return userManager;
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void createUser() {
		userManager.createUser(user);
	}

	public List<User> getUsers() {
		return userManager.getUsers();
	}
	
	public String editUserAction(User user) {
		user.setEditable(true);
		return null;
	}

	public int editUser(User user) {
		return userManager.editUser(user);
	}
}
