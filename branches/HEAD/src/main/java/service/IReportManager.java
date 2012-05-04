package service;

import java.util.List;

import entry.Report;

public interface IReportManager {

    public List<Report> getReports();

    public void saveReport(Report report);

    public void editReport(Report report);

    public List<Report> getReports(String sortBy, boolean sortOrder);

}
