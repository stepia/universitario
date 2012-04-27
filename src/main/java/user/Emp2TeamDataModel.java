package user;

import java.util.List;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

import entry.Emp2Team;

public class Emp2TeamDataModel extends ListDataModel<Emp2Team> implements SelectableDataModel<Emp2Team> {

    public Emp2TeamDataModel() {
    }

    public Emp2TeamDataModel(List<Emp2Team> data) {
        super(data);
    }

    public Emp2Team getRowData(String rowKey) {

        @SuppressWarnings("unchecked")
        List<Emp2Team> emp2Teams = (List<Emp2Team>) getWrappedData();

        for (Emp2Team emp2Team : emp2Teams) {
            if (emp2Team.getId().equals(rowKey))
                return emp2Team;
        }

        return null;
    }

    public Long getRowKey(Emp2Team emp2Team) {
        return emp2Team.getId();
    }
}
