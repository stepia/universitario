package dao;

import java.util.List;

import entry.User;

public interface UserDao {

    public List<User> getUsers();

    public List<User> getUsers(String sortBy, boolean sortOrder);

    public void saveUser(User user);

    public void editUser(User user);

    public User getUser(String username);

    public void deleteUser(User user);

    public void saveOrUpdate(User user);

}
