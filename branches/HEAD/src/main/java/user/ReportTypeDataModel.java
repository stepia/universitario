package user;

import java.util.List;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

import entry.ReportType;

public class ReportTypeDataModel extends ListDataModel<ReportType> implements SelectableDataModel<ReportType> {

    public ReportTypeDataModel() {
    }

    public ReportTypeDataModel(List<ReportType> data) {
        super(data);
    }

    public ReportType getRowData(String rowKey) {

        @SuppressWarnings("unchecked")
        List<ReportType> reportTypes = (List<ReportType>) getWrappedData();

        for (ReportType reportType : reportTypes) {
            if (reportType.getName().equals(rowKey))
                return reportType;
        }

        return null;
    }

    public String getRowKey(ReportType reportType) {
        return reportType.getName();
    }
}
