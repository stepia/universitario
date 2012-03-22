package user;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import org.hibernate.Hibernate;
import org.springframework.transaction.annotation.Transactional;

import service.IUserManager;
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
	private IUserManager userManager;

	private int length;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public IUserManager getUserManager() {
		return userManager;
	}

	public void setUserManager(IUserManager userManager) {
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
		List<User> users = userManager.getUsers();
//		users.get(0).getEmployees().size();
		this.length = users.size();
		return users;
	}

	public String editUserAction(User user) {
		// userManager.fetchEmployees(user);
		user.setEditable(true);
		return null;
	}

	public void editUser() {
		userManager.editUser(user);
	}
}
