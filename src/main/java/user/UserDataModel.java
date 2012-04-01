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

        @SuppressWarnings("unchecked")
        List<User> users = (List<User>) getWrappedData();

        for (User user : users) {
            if (user.getUsername().equals(rowKey))
                return user;
        }

        return null;
    }

    public String getRowKey(User user) {
        return user.getUsername();
    }
}
