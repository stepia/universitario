package user;

import java.util.List;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

import entry.Role;

public class RoleDataModel extends ListDataModel<Role> implements SelectableDataModel<Role> {

    public RoleDataModel() {
    }

    public RoleDataModel(List<Role> data) {
        super(data);
    }

    public Role getRowData(String rowKey) {
    	Long id = Long.valueOf(rowKey);

        @SuppressWarnings("unchecked")
        List<Role> roles = (List<Role>) getWrappedData();

        for (Role role : roles) {
            if (role.getId().equals(id))
                return role;
        }

        return null;
    }

    public Long getRowKey(Role role) {
        return role.getId();
    }
}
