package user;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import service.IReportTypeManager;
import entry.ReportType;

@ManagedBean
@RequestScoped
public class ReportTypeViewBean {

    private ReportType reportType;
    @ManagedProperty(value = "#{reportTypeManager}")
    private IReportTypeManager reportTypeManager;
    private ReportType selectedReportType;
    private ReportType[] selectedReportTypes;
    private List<ReportType> reportTypes = new ArrayList<ReportType>();

    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public ReportType[] getSelectedReportTypes() {
        return selectedReportTypes;
    }

    public void setSelectedReportTypes(ReportType[] selectedReportTypes) {
        this.selectedReportTypes = selectedReportTypes;
    }

    public IReportTypeManager getReportTypeManager() {
        return reportTypeManager;
    }

    public void setReportTypeManager(IReportTypeManager reportTypeManager) {
        this.reportTypeManager = reportTypeManager;
    }

    public List<ReportType> getReportTypes() {
    	reportTypes = reportTypeManager.getReportTypes();
        this.length = reportTypes.size();
        return reportTypes;
    }

    public ReportType getSelectedReportType() {
        return selectedReportType;
    }

    public void setSelectedReportType(ReportType selectedReportType) {
        this.selectedReportType = selectedReportType;
    }

    public ReportType getReportType() {
        return reportType;
    }

    public void setReportType(ReportType reportType) {
        this.reportType = reportType;
    }

}
