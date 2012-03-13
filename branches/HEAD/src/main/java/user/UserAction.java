package user;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import service.UserManager;
import entry.Employee;
import entry.Person;
import entry.User;

@ManagedBean
@SessionScoped
public class UserAction {

	@ManagedProperty(value = "#{user}")
	private User user;
	@ManagedProperty(value = "#{person}")
	private Person person;
	@ManagedProperty(value = "#{employee}")
	private Employee employee;
	@ManagedProperty(value = "#{userManager}")
	private UserManager userManager;

	public UserManager getUserManager() {
		return userManager;
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
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
		// this.user=user;
		return null;
	}

	public int editUser() {
		// long id = (Long)
		// e.getComponent().getAttributes().get("targetObject");
		// User user = userManager.getUserById(id);
		return userManager.editUser(user, person);
	}
}
