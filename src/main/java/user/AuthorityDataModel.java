package user;

import java.util.List;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

import entry.Authority;

public class AuthorityDataModel extends ListDataModel<Authority> implements SelectableDataModel<Authority> {

    public AuthorityDataModel() {
    }

    public AuthorityDataModel(List<Authority> data) {
        super(data);
    }

    public Authority getRowData(String rowKey) {
    	Long id = Long.valueOf(rowKey);

        @SuppressWarnings("unchecked")
        List<Authority> authorities = (List<Authority>) getWrappedData();

        for (Authority authority : authorities) {
            if (authority.getId().equals(id))
                return authority;
        }

        return null;
    }

    public Long getRowKey(Authority authority) {
        return authority.getId();
    }
}
