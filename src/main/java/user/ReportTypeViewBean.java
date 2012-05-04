package user;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;
import org.primefaces.event.data.SortEvent;

import service.IReportTypeManager;
import entry.ReportType;

@ManagedBean
@SessionScoped
public class ReportTypeViewBean {

    @ManagedProperty(value = "#{reportTypeManager}")
    private IReportTypeManager reportTypeManager;
    private ReportType selectedReportType;
    private List<ReportType> reportTypes = new ArrayList<ReportType>();
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

    public IReportTypeManager getReportTypeManager() {
        return reportTypeManager;
    }

    public void setReportTypeManager(IReportTypeManager reportTypeManager) {
        this.reportTypeManager = reportTypeManager;
    }

    public List<ReportType> getReportTypes() {
    	if (sortBy == null) {
    		reportTypes = getReportTypeManager().getReportTypes();
        } else {
        	reportTypes = getReportTypeManager().getReportTypes(sortBy, sortOrder);
        }
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
        Action act = Action.fromString(action);
        switch (act)
            {
            case DELETE:
                System.out.println("Penny coin");
                break;
            case CREATE:
                setSelectedReportType(new ReportType());
                break;
            case SAVE:
                getReportTypeManager().saveReportType(getSelectedReportType());
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
