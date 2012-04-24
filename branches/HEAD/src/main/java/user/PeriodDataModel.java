package user;

import java.util.List;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

import entry.Period;

public class PeriodDataModel extends ListDataModel<Period> implements SelectableDataModel<Period> {

    public PeriodDataModel() {
    }

    public PeriodDataModel(List<Period> data) {
        super(data);
    }

    public Period getRowData(String rowKey) {

        @SuppressWarnings("unchecked")
        List<Period> periods = (List<Period>) getWrappedData();

        for (Period period : periods) {
            if (period.getValue().equals(rowKey))
                return period;
        }

        return null;
    }

    public String getRowKey(Period period) {
        return period.getValue();
    }
}
