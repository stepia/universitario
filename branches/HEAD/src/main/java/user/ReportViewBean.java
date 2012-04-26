package user;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import service.IReportManager;
import entry.Report;

@ManagedBean
@RequestScoped
public class ReportViewBean {

    private Report report;
    @ManagedProperty(value = "#{reportManager}")
    private IReportManager reportManager;
    private Report selectedReport;
    private Report[] selectedReports;
    private List<Report> reports = new ArrayList<Report>();

    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Report[] getSelectedReports() {
        return selectedReports;
    }

    public void setSelectedReports(Report[] selectedReports) {
        this.selectedReports = selectedReports;
    }

    public IReportManager getReportManager() {
        return reportManager;
    }

    public void setReportManager(IReportManager reportManager) {
        this.reportManager = reportManager;
    }

    public List<Report> getReports() {
    	reports = reportManager.getReports();
        this.length = reports.size();
        return reports;
    }

    public Report getSelectedReport() {
        return selectedReport;
    }

    public void setSelectedReport(Report selectedReport) {
        this.selectedReport = selectedReport;
    }

    public Report getReport() {
        return report;
    }

    public void setReport(Report report) {
        this.report = report;
    }

}
