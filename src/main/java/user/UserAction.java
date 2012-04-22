package user;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import service.IUserManager;
import entry.Employee;
import entry.Person;
import entry.User;

@ManagedBean
@RequestScoped
public class UserAction {

    @ManagedProperty(value = "#{user}")
    private User user;
    @ManagedProperty(value = "#{person}")
    private Person person;
    @ManagedProperty(value = "#{employee}")
    private Employee employee;
    @ManagedProperty(value = "#{userManager}")
    private IUserManager userManager;
    private List<User> users = new ArrayList<User>();
    private User selectedUser;
    private User[] selectedUsers;

    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public IUserManager getUserManager() {
        return userManager;
    }

    public void setUserManager(IUserManager userManager) {
        this.userManager = userManager;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void createUser() {
        List<Employee> employees = new ArrayList<Employee>();
        Employee employee = new Employee();
        // employee.setUserId(user.getId());
        employee.setUsrname(user.getUsername());
        employees.add(employee);
        user.setEmployees(employees);
        userManager.createUser(user);
    }

    public void addEmployee() {
        // employee.setUserId(user.getId());
        employee.setUsrname(user.getUsername());
        user.getEmployees().add(employee);
        userManager.editUser(user);
    }

    public List<User> getUsers() {
        users = userManager.getUsers();
        this.length = users.size();
        return users;
    }

    public String editUserAction(User user) {
        user.setEditable(true);
        return null;
    }

    public void editUser() {
        userManager.editUser(user);
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

}