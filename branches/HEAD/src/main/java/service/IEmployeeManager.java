package service;

import java.util.List;

import entry.Employee;

public interface IEmployeeManager {

    public List<Employee> getEmployees();

    public void createEmployee(Employee employee);

    public void editEmployee(Employee employee);

}
