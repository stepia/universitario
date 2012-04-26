package service;

import java.util.List;

import dao.ReportTypeDao;
import entry.ReportType;

public class ReportTypeManager implements IReportTypeManager {

    private ReportTypeDao reportTypeDao;

    public ReportTypeDao getReportTypeDao() {
        return reportTypeDao;
    }

    public void setReportTypeDao(ReportTypeDao reportTypeDao) {
        this.reportTypeDao = reportTypeDao;
    }

    public void createReportType(ReportType reportType) {
        getReportTypeDao().createReportType(reportType);
    }

    public List<ReportType> getReportTypes() {
        return getReportTypeDao().getReportTypes();
    }

    public void editReportType(ReportType reportType) {
        getReportTypeDao().editReportType(reportType);
    }

    public ReportType getReportType(String name) {
        return getReportTypeDao().getReportType(name);
    }

}
