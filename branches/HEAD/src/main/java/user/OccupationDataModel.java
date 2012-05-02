package user;

import java.util.List;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

import entry.Occupation;

public class OccupationDataModel extends ListDataModel<Occupation> implements SelectableDataModel<Occupation> {

    public OccupationDataModel() {
    }

    public OccupationDataModel(List<Occupation> data) {
        super(data);
    }

    public Occupation getRowData(String rowKey) {
    	Long id = Long.valueOf(rowKey);

        @SuppressWarnings("unchecked")
        List<Occupation> occupations = (List<Occupation>) getWrappedData();

        for (Occupation occupation : occupations) {
            if (occupation.getId().equals(id))
                return occupation;
        }

        return null;
    }

    public Long getRowKey(Occupation occupation) {
        return occupation.getId();
    }
}
