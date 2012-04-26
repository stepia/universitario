package dao;

import java.util.List;

import entry.Report;

public interface ReportDao {

    public List<Report> getReports();

    public void createReport(Report report);

    public void editReport(Report report);

    public Report getReport(Long id);

}
