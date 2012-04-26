package service;

import java.util.List;

import entry.ReportType;

public interface IReportTypeManager {

    public List<ReportType> getReportTypes();

    public void createReportType(ReportType reportType);

    public void editReportType(ReportType reportType);

}
