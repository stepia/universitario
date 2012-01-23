
import static junit.framework.Assert.assertEquals;

import java.util.List;

import model.Employee;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

import reporting.EmployeeFilter;
import reporting.ReportingBean;

@ContextConfiguration(locations = { "faces-confg.xml", "web.xml" })
public class ReportingTest {

	@Test
	public void reportTest() {
		ReportingBean reporting = new ReportingBean();
		EmployeeFilter employeeFilter = new EmployeeFilter();

		employeeFilter.setCourse((byte) 1);
		employeeFilter.setDebt(false);

		List<Employee> employee = reporting.report(employeeFilter);

		assertEquals(employee.get(0).getCourse(), 1);
		assertEquals(employee.get(0).isDebt(), false);

	}
}
