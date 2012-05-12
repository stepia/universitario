package user;

import java.util.List;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

import entry.Employee;

public class EmployeeDataModel extends ListDataModel<Employee> implements SelectableDataModel<Employee> {

    public EmployeeDataModel() {
    }

    public EmployeeDataModel(List<Employee> data) {
        super(data);
    }

    public Employee getRowData(String rowKey) {
        Long id = Long.valueOf(rowKey);

        @SuppressWarnings("unchecked")
        List<Employee> employees = (List<Employee>) getWrappedData();

        for (Employee employee : employees) {
            if (employee.getId().equals(id))
                return employee;
        }

        return null;
    }

    public Long getRowKey(Employee employee) {
        return employee.getId();
    }
}
