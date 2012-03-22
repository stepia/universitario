package service;

import java.util.List;

import dao.UserDao;
import entry.User;

public class UserManager implements IUserManager {

	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void createUser(User user) {
		getUserDao().createUser(user);
	}

	public List<User> getUsers() {
		return getUserDao().getUsers();
	}

	public void editUser(User user) {
		getUserDao().editUser(user);
	}
	
	public void fetchEmployees(User user){
		getUserDao().fetchEmployees(user);
	}

}
