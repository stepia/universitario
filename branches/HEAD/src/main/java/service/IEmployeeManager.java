package service;

import java.util.List;

import entry.Employee;

public interface IEmployeeManager {

    public List<Employee> getEmployees();

    public void saveEmployee(Employee employee);

    public void editEmployee(Employee employee);

    public List<Employee> getEmployees(String sortBy, boolean sortOrder);

}
