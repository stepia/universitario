package user;

import java.util.List;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

import entry.User;

public class UserDataModel extends ListDataModel<User> implements SelectableDataModel<User> {

    public UserDataModel() {
    }

    public UserDataModel(List<User> data) {
        super(data);
    }

    public User getRowData(String rowKey) {
    	Long id = Long.valueOf(rowKey);

        @SuppressWarnings("unchecked")
        List<User> users = (List<User>) getWrappedData();

        for (User user : users) {
            if (user.getId().equals(id))
                return user;
        }

        return null;
    }

    public Long getRowKey(User user) {
        return user.getId();
    }
}
