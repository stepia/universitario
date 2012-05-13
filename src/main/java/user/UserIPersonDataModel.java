package user;

import java.util.List;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

import entry.UserIPerson;

public class UserIPersonDataModel extends ListDataModel<UserIPerson> implements SelectableDataModel<UserIPerson> {

    public UserIPersonDataModel() {
    }

    public UserIPersonDataModel(List<UserIPerson> data) {
        super(data);
    }

    public UserIPerson getRowData(String rowKey) {
        Long id = Long.valueOf(rowKey);

        @SuppressWarnings("unchecked")
        List<UserIPerson> employees = (List<UserIPerson>) getWrappedData();

        for (UserIPerson employee : employees) {
            if (employee.getId().equals(id))
                return employee;
        }

        return null;
    }

    public Long getRowKey(UserIPerson employee) {
        return employee.getId();
    }
}
