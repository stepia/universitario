package user;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import service.IEmployeeManager;
import entry.Employee;

@ManagedBean
@RequestScoped
public class EmployeeViewBean {

    private Employee employee;
    @ManagedProperty(value = "#{employeeManager}")
    private IEmployeeManager employeeManager;
    private Employee selectedEmployee;
    private Employee[] selectedEmployees;
    private List<Employee> employees = new ArrayList<Employee>();

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

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

}
