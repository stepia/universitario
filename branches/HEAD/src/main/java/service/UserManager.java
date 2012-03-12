package service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

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

    @Transactional
    public void createUser(User user) {
        getUserDao().createUser(user);
    }

    @Transactional
    public List<User> getUsers() {
        return getUserDao().getUsers();
    }

    @Transactional
    public void deleteUser(User user) {
        getUserDao().deleteUser(user);
    }
    @Transactional
    public int editUser(User user) {
        return getUserDao().editUser(user);
    }

}
