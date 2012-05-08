package dao;

import java.util.List;

import entry.Report;

public interface ReportDao {

    public List<Report> getReports();

    public List<Report> getReports(String sortBy, boolean sortOrder);

    public void saveReport(Report report);

    public void editReport(Report report);

    public Report getReport(Long id);

    public void deleteReport(Report report);

    public void saveOrUpdate(Report report);

}
