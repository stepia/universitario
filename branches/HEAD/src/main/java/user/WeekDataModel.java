package user;

import java.util.List;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

import entry.Week;

public class WeekDataModel extends ListDataModel<Week> implements SelectableDataModel<Week> {

    public WeekDataModel() {
    }

    public WeekDataModel(List<Week> data) {
        super(data);
    }

    public Week getRowData(String rowKey) {
    	Long id = Long.valueOf(rowKey);

        @SuppressWarnings("unchecked")
        List<Week> weeks = (List<Week>) getWrappedData();

        for (Week week : weeks) {
            if (week.getId().equals(id))
                return week;
        }

        return null;
    }

    public Long getRowKey(Week week) {
        return week.getId();
    }
}
