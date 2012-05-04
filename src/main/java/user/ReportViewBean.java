package user;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;

import service.IReportManager;
import entry.Report;

@ManagedBean
@SessionScoped
public class ReportViewBean {

    @ManagedProperty(value = "#{reportManager}")
    private IReportManager reportManager;
    private Report selectedReport;
    private Report[] selectedReports;
    private List<Report> reports = new ArrayList<Report>();
    private boolean editible;

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

    public void onRowSelect(SelectEvent event) throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("reportDetail.xhtml");
        setEditible(true);
    }

    public void init() throws IOException {
        setSelectedReport(null);
        setEditible(false);
    }

    public boolean isEditible() {
        return editible;
    }

    public void setEditible(boolean editible) {
        this.editible = editible;
    }

    public String doAction(String action) {
        return action;
    }

}
