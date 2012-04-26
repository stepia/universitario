package service;

import java.util.List;

import dao.ReportDao;
import entry.Report;

public class ReportManager implements IReportManager {

    private ReportDao reportDao;

    public ReportDao getReportDao() {
        return reportDao;
    }

    public void setReportDao(ReportDao reportDao) {
        this.reportDao = reportDao;
    }

    public void createReport(Report report) {
        getReportDao().createReport(report);
    }

    public List<Report> getReports() {
        return getReportDao().getReports();
    }

    public void editReport(Report report) {
        getReportDao().editReport(report);
    }

    public Report getReport(Long id) {
        return getReportDao().getReport(id);
    }

}
