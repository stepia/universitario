package web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import dao.EmployeeDao;
import entry.Employee;

@ManagedBean
@SessionScoped
public class Universitario {

    @ManagedProperty(value = "#{employeeManager}")
    private EmployeeDao employeeManager;
    private Employee employee;
    private String title;

    public String doAction(String action) {
        return action;
    }

    public String getTitle() {
        if (getEmployee() == null) {
            String user = FacesContext.getCurrentInstance().getExternalContext().getRemoteUser();
            setEmployee(getEmployeeManager().getEmployee(user));
        }
        title = getEmployee().getPerson().getLastnameua() + " " + getEmployee().getPerson().getFirstnameua();
        return title;
    }

    public EmployeeDao getEmployeeManager() {
        return employeeManager;
    }

    public void setEmployeeManager(EmployeeDao employeeManager) {
        this.employeeManager = employeeManager;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

}
