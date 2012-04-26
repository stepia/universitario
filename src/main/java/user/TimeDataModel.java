package user;

import java.util.List;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

import entry.Time;

public class TimeDataModel extends ListDataModel<Time> implements SelectableDataModel<Time> {

    public TimeDataModel() {
    }

    public TimeDataModel(List<Time> data) {
        super(data);
    }

    public Time getRowData(String rowKey) {

        @SuppressWarnings("unchecked")
        List<Time> times = (List<Time>) getWrappedData();

        for (Time time : times) {
            if (time.getId().equals(rowKey))
                return time;
        }

        return null;
    }

    public Long getRowKey(Time time) {
        return time.getId();
    }
}
