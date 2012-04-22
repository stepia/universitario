package user;

import java.util.List;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

import entry.Emp2team;

public class Emp2teamDataModel extends ListDataModel<Emp2team> implements SelectableDataModel<Emp2team> {

    public Emp2teamDataModel() {
    }

    public Emp2teamDataModel(List<Emp2team> data) {
        super(data);
    }

    public Emp2team getRowData(String rowKey) {

        @SuppressWarnings("unchecked")
        List<Emp2team> emp2teams = (List<Emp2team>) getWrappedData();

        for (Emp2team emp2team : emp2teams) {
            if (emp2team.getId().equals(rowKey))
                return emp2team;
        }

        return null;
    }

    public Long getRowKey(Emp2team emp2team) {
        return emp2team.getId();
    }
}
