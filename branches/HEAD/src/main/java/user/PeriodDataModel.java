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
    	Long id = Long.valueOf(rowKey);

        @SuppressWarnings("unchecked")
        List<Period> periods = (List<Period>) getWrappedData();

        for (Period period : periods) {
            if (period.getId().equals(id))
                return period;
        }

        return null;
    }

    public Long getRowKey(Period period) {
        return period.getId();
    }
}
