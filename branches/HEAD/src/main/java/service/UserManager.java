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

    public void saveUser(User state) {
        getUserDao().saveUser(state);
    }

    public void saveOrUpdate(User state) {
        getUserDao().saveOrUpdate(state);
    }

    public void deleteUser(User state) {
        getUserDao().deleteUser(state);
    }

    public List<User> getUsers() {
        return getUserDao().getUsers();
    }

    public List<User> getUsers(String sortBy, boolean sortOrder) {
        return getUserDao().getUsers(sortBy, sortOrder);
    }

    public void editUser(User user) {
        getUserDao().editUser(user);
    }

    public User getUser(String username) {
        return getUserDao().getUser(username);
    }

}
