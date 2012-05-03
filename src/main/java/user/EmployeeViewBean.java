package user;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;

import service.IEmployeeManager;
import entry.Employee;

@ManagedBean
@SessionScoped
public class EmployeeViewBean {

    @ManagedProperty(value = "#{employeeManager}")
    private IEmployeeManager employeeManager;
    private Employee selectedEmployee;
    private Employee[] selectedEmployees;
    private List<Employee> employees = new ArrayList<Employee>();
    private boolean editible;

    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Employee[] getSelectedEmployees() {
        return selectedEmployees;
    }

    public void setSelectedEmployees(Employee[] selectedEmployees) {
        this.selectedEmployees = selectedEmployees;
    }

    public IEmployeeManager getEmployeeManager() {
        return employeeManager;
    }

    public void setEmployeeManager(IEmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }

    public List<Employee> getEmployees() {
        employees = employeeManager.getEmployees();
        this.length = employees.size();
        return employees;
    }

    public Employee getSelectedEmployee() {
        return selectedEmployee;
    }

    public void setSelectedEmployee(Employee selectedEmployee) {
        this.selectedEmployee = selectedEmployee;
    }

    public void onRowSelect(SelectEvent event) throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("employeeDetail.xhtml");
        setEditible(true);
    }

    public void init() throws IOException {
        setSelectedEmployee(null);
        setEditible(false);
    }

    public boolean isEditible() {
        return editible;
    }

    public void setEditible(boolean editible) {
        this.editible = editible;
    }

    public String doAction(String action) {
        return action;
    }

}
