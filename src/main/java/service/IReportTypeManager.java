package service;

import java.util.List;

import entry.ReportType;

public interface IReportTypeManager {

    public List<ReportType> getReportTypes();

    public void saveReportType(ReportType reportType);

    public void editReportType(ReportType reportType);

    public List<ReportType> getReportTypes(String sortBy, boolean sortOrder);

}
