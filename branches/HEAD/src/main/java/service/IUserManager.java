package service;

import java.util.List;

import entry.User;

public interface IUserManager {

	public List<User> getUsers();

	public void createUser(User user);

	public void editUser(User user);
	
	public void fetchEmployees(User user);

}
