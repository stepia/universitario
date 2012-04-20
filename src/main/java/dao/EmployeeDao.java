package dao;

import java.util.List;

import entry.Employee;

public interface EmployeeDao {

    public List<Employee> getEmployees();

    public void createEmployee(Employee employee);

    public void editEmployee(Employee employee);

    public Employee getEmployee(Long id);

}
