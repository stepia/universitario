package user;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;

import service.IReportTypeManager;
import entry.ReportType;

@ManagedBean
@SessionScoped
public class ReportTypeViewBean {

    @ManagedProperty(value = "#{reportTypeManager}")
    private IReportTypeManager reportTypeManager;
    private ReportType selectedReportType;
    private ReportType[] selectedReportTypes;
    private List<ReportType> reportTypes = new ArrayList<ReportType>();
    private boolean editible;

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

    public void onRowSelect(SelectEvent event) throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("reporttypeDetail.xhtml");
        setEditible(true);
    }

    public void init() throws IOException {
        setSelectedReportType(null);
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
