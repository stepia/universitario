package web;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import service.UserManager;
import entry.User;

@ManagedBean
@SessionScoped
public class UserInfo {
    @ManagedProperty(value = "#{userManager}")
    private UserManager userManager;

    public UserManager getUserManager() {
        return userManager;
    }

    public void setUserManager(UserManager userManager) {
        this.userManager = userManager;
    }

    private List<User> users;

    public List<User> getUsers() {
        users = this.getUserManager().getUsers();
        return users;
    }

}
