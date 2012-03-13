package dao;

import java.util.List;

import entry.Employee;
import entry.Person;
import entry.User;

public interface UserDao {

	public List<User> getUsers();

	public void createUser(User contact);

	public void deleteUser(User user);

	public int editUser(User user, Person person);

	public User getUserById(long id);

}
