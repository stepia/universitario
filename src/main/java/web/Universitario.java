package web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import dao.UserDao;
import entry.Person;
import entry.User;
import entry.UserIPerson;

@ManagedBean(name = "mainbean")
@SessionScoped
public class Universitario {

    @ManagedProperty(value = "#{userManager}")
    private UserDao userManager;
    private static User user;
    private static Person person;
    private static UserIPerson userIPerson;

    public Universitario() {
        // String user = FacesContext.getCurrentInstance().getExternalContext().getRemoteUser();
        // setUser(getUserManager().getUser(user));
        // setPerson(getUser().getPerson());
    }

    public UserDao getUserManager() {
        return userManager;
    }

    public void setUserManager(UserDao userManager) {
        this.userManager = userManager;
    }

    public static Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        Universitario.person = person;
    }

    public static UserIPerson getUserIPerson() {
        return userIPerson;
    }

    public static void setEmployee(UserIPerson userIPerson) {
        Universitario.userIPerson = userIPerson;
    }

    public static User getUser() {
        return user;
    }

    public static void setUser(User user) {
        Universitario.user = user;
    }

    private String title;

    public String doAction(String action) {
        return action;
    }

    public String getTitle() {
        // Person per = Universitario.getPerson();
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
