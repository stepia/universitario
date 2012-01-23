package reporting;

import java.util.List;

public interface Reportable {

	List<?> report(EmployeeFilter employeeFilter);

}
