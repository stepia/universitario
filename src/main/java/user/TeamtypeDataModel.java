package user;

import java.util.List;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

import entry.Teamtype;

public class TeamtypeDataModel extends ListDataModel<Teamtype> implements SelectableDataModel<Teamtype> {

    public TeamtypeDataModel() {
    }

    public TeamtypeDataModel(List<Teamtype> data) {
        super(data);
    }

    public Teamtype getRowData(String rowKey) {

        @SuppressWarnings("unchecked")
        List<Teamtype> teamtypes = (List<Teamtype>) getWrappedData();

        for (Teamtype teamtype : teamtypes) {
            if (teamtype.getId().equals(rowKey))
                return teamtype;
        }

        return null;
    }

    public Long getRowKey(Teamtype teamtype) {
        return teamtype.getId();
    }
}
