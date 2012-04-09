package dao;

import java.util.List;

import entry.User;

public interface UserDao {

    public List<User> getUsers();

    public void createUser(User contact);

    public void editUser(User user);

    public User getUser(String username);

}
