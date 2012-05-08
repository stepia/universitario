package user;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;
import org.primefaces.event.data.SortEvent;

import service.IReportManager;
import entry.Report;

@ManagedBean
@SessionScoped
public class ReportViewBean {

    @ManagedProperty(value = "#{reportManager}")
    private IReportManager reportManager;
    private Report selectedReport;
    private List<Report> reports = new ArrayList<Report>();
    private boolean editible;
    private boolean sortOrder;
    private String sortBy;

    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public IReportManager getReportManager() {
        return reportManager;
    }

    public void setReportManager(IReportManager reportManager) {
        this.reportManager = reportManager;
    }

    public List<Report> getReports() {
    	if (sortBy == null) {
    		reports = getReportManager().getReports();
        } else {
        	reports = getReportManager().getReports(sortBy, sortOrder);
        }
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

    public String doAction(String action) throws UnsupportedEncodingException {
        Action act = Action.fromString(action);
        switch (act)
            {
            case DELETE:
            	getReportManager().deleteReport(getSelectedReport());
                break;
            case CREATE:
                setSelectedReport(new Report());
                break;
            case SAVE:
            	if (getSelectedReport().getCreated() != null) {
                    getReportManager().saveOrUpdate(getSelectedReport());
                } else {
                    getReportManager().saveReport(getSelectedReport());
                }
                break;
            }
        return action;
    }
    
    public void caseListSortListner(SortEvent sortEvent) {
        setSortBy(sortEvent.getSortColumn().getId());
        if (sortEvent.isAscending()) {
            setSortOrder(true);
        } else {
            setSortOrder(false);
        }
    }

    public boolean isSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(boolean sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

}
