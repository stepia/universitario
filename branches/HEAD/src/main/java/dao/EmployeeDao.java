package dao;

import java.util.List;

import entry.Employee;

public interface EmployeeDao {

    public List<Employee> getEmployees();

    public List<Employee> getEmployees(String sortBy, boolean sortOrder);

    public void saveEmployee(Employee employee);

    public void editEmployee(Employee employee);

    public Employee getEmployee(Long id);

    public Employee getEmployee(String userName);

    public void deleteEmployee(Employee employee);

    public void saveOrUpdate(Employee employee);

}
