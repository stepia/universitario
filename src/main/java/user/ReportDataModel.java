package user;

import java.util.List;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

import entry.Report;

public class ReportDataModel extends ListDataModel<Report> implements SelectableDataModel<Report> {

    public ReportDataModel() {
    }

    public ReportDataModel(List<Report> data) {
        super(data);
    }

    public Report getRowData(String rowKey) {

        @SuppressWarnings("unchecked")
        List<Report> reports = (List<Report>) getWrappedData();

        for (Report report : reports) {
            if (report.getId().equals(rowKey))
                return report;
        }

        return null;
    }

    public Long getRowKey(Report report) {
        return report.getId();
    }
}
