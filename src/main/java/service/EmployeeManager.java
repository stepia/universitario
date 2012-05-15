package service;

import java.util.List;

import dao.EmployeeDao;
import entry.Employee;

public class EmployeeManager implements EmployeeDao {

    private EmployeeDao employeeDao;

    public EmployeeDao getEmployeeDao() {
        return employeeDao;
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public void saveEmployee(Employee employee) {
        getEmployeeDao().saveEmployee(employee);
    }

    public void saveOrUpdate(Employee employee) {
        getEmployeeDao().saveOrUpdate(employee);
    }

    public void deleteEmployee(Employee employee) {
        getEmployeeDao().deleteEmployee(employee);
    }

    public List<Employee> getEmployees() {
        return getEmployeeDao().getEmployees();
    }

    public List<Employee> getEmployees(String sortBy, boolean sortOrder) {
        return getEmployeeDao().getEmployees(sortBy, sortOrder);
    }

    public void editEmployee(Employee employee) {
        getEmployeeDao().editEmployee(employee);
    }

    public Employee getEmployee(Long id) {
        return getEmployeeDao().getEmployee(id);
    }

    public Employee getEmployee(String userName) {
        return getEmployeeDao().getEmployee(userName);
    }

}
