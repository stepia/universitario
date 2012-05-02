package user;

import java.util.List;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

import entry.Discipline;

public class DisciplineDataModel extends ListDataModel<Discipline> implements SelectableDataModel<Discipline> {

    public DisciplineDataModel() {
    }

    public DisciplineDataModel(List<Discipline> data) {
        super(data);
    }

    public Discipline getRowData(String rowKey) {
    	Long id = Long.valueOf(rowKey);

        @SuppressWarnings("unchecked")
        List<Discipline> disciplines = (List<Discipline>) getWrappedData();

        for (Discipline discipline : disciplines) {
            if (discipline.getId().equals(id))
                return discipline;
        }

        return null;
    }

    public Long getRowKey(Discipline discipline) {
        return discipline.getId();
    }
}
