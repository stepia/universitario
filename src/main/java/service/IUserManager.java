package service;

import java.util.List;

import entry.User;

public interface IUserManager {

    public List<User> getUsers();

    public void saveUser(User user);

    public void editUser(User user);

    public List<User> getUsers(String sortBy, boolean sortOrder);

    public void deleteUser(User user);

    public void saveOrUpdate(User user);

}
