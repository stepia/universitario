package dao;

import java.util.List;

import entry.ReportType;

public interface ReportTypeDao {

    public List<ReportType> getReportTypes();

    public void createReportType(ReportType reporttype);

    public void editReportType(ReportType reporttype);

    public ReportType getReportType(String name);

}
