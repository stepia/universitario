package web;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import service.UserManager;
import entry.User;

@ManagedBean
@RequestScoped
public class UserBean {
    @ManagedProperty(value = "#{userManager}")
    private UserManager userManager;
    private final static String[] roles;
    private final static String[] status;
    private List<User> users;
    private User selectedUser;
    private User[] selectedUsers;
    static {
        roles = new String[2];
        roles[0] = "ROLE_ADMIN";
        roles[1] = "ROLE_USER";

        status = new String[2];
        status[0] = "true";
        status[1] = "false";
    }

    public UserBean() {
        users = new ArrayList<User>();

        populateRandomUsers(users, 50);
    }

    public User[] getSelectedUsers() {
        return selectedUsers;
    }

    public void setSelectedUsers(User[] selectedUsers) {
        this.selectedUsers = selectedUsers;
    }

    public User getSelectedUser() {
        return selectedUser;
    }

    public void setSelectedUser(User selectedUser) {
        this.selectedUser = selectedUser;
    }

    private void populateRandomUsers(List<User> list, int size) {

        for (int i = 0; i < size; i++) {
            User user = new User();
            user.setId(i);
            user.setUsername(String.valueOf(i + 1));
            user.setEnabled(true);
            list.add(user);
        }

    }

    public List<User> getUsers() {
        return users;
    }

    public UserManager getUserManager() {
        return userManager;
    }

    public void setUserManager(UserManager userManager) {
        this.userManager = userManager;
    }

}
