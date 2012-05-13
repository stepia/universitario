package service;

import java.util.List;

import dao.ReportDao;
import entry.Report;

public class ReportManager implements ReportDao {

    private ReportDao reportDao;

    public ReportDao getReportDao() {
        return reportDao;
    }

    public void setReportDao(ReportDao reportDao) {
        this.reportDao = reportDao;
    }

    public void saveReport(Report report) {
        getReportDao().saveReport(report);
    }

    public void saveOrUpdate(Report report) {
        getReportDao().saveOrUpdate(report);
    }

    public void deleteReport(Report report) {
        getReportDao().deleteReport(report);
    }

    public List<Report> getReports() {
        return getReportDao().getReports();
    }

    public List<Report> getReports(String sortBy, boolean sortOrder) {
        return getReportDao().getReports(sortBy, sortOrder);
    }

    public void editReport(Report report) {
        getReportDao().editReport(report);
    }

    public Report getReport(Long id) {
        return getReportDao().getReport(id);
    }

}
