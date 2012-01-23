package reporting;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import model.Employee;

@ManagedBean
@RequestScoped
public class ReportingBean implements Reportable {

	private List<Employee> employee = new ArrayList<Employee>();
	
	@ManagedProperty(value = "#{employeeFilter}")
	private EmployeeFilter employeeFilter;

	public EmployeeFilter getEmployeeFilter() {
		return employeeFilter;
	}

	public void setEmployeeFilter(EmployeeFilter employeeFilter) {
		this.employeeFilter = employeeFilter;
	}

	@Override
	public List<Employee> report(EmployeeFilter filter) {
		// FIXME add fecth from DB impl.
		employee.add(filter);
		employee.add(filter);
		return employee;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

}
