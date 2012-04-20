package service;

import java.util.List;

import dao.EmployeeDao;
import entry.Employee;

public class EmployeeManager implements IEmployeeManager {

    private EmployeeDao employeeDao;

    public EmployeeDao getEmployeeDao() {
        return employeeDao;
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public void createEmployee(Employee employee) {
        getEmployeeDao().createEmployee(employee);
    }

    public List<Employee> getEmployees() {
        return getEmployeeDao().getEmployees();
    }

    public void editEmployee(Employee employee) {
        getEmployeeDao().editEmployee(employee);
    }

    public Employee getEmployee(Long id) {
        return getEmployeeDao().getEmployee(id);
    }

}
