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

    public void saveReportType(ReportType reportType) {
        getReportTypeDao().saveReportType(reportType);
    }

    public void saveOrUpdate(ReportType reportType) {
        getReportTypeDao().saveOrUpdate(reportType);
    }

    public void deleteReportType(ReportType reportType) {
        getReportTypeDao().deleteReportType(reportType);
    }

    public List<ReportType> getReportTypes() {
        return getReportTypeDao().getReportTypes();
    }

    public List<ReportType> getReportTypes(String sortBy, boolean sortOrder) {
        return getReportTypeDao().getReportTypes(sortBy, sortOrder);
    }

    public void editReportType(ReportType reportType) {
        getReportTypeDao().editReportType(reportType);
    }

    public ReportType getReportType(Long id) {
        return getReportTypeDao().getReportType(id);
    }

}
