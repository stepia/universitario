package dao;

import java.util.List;

import entry.ReportType;

public interface ReportTypeDao {

    public List<ReportType> getReportTypes();

    public List<ReportType> getReportTypes(String sortBy, boolean sortOrder);

    public void saveReportType(ReportType reporttype);

    public void editReportType(ReportType reporttype);

    public ReportType getReportType(Long id);

    public void deleteReportType(ReportType reporttype);

    public void saveOrUpdate(ReportType reporttype);

}
