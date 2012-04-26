package service;

import java.util.List;

import entry.Report;

public interface IReportManager {

    public List<Report> getReports();

    public void createReport(Report report);

    public void editReport(Report report);

}
