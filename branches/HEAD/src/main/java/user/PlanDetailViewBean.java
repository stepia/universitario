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

import service.IPlanDetailManager;
import entry.PlanDetail;

@ManagedBean
@SessionScoped
public class PlanDetailViewBean {

    @ManagedProperty(value = "#{planDetailManager}")
    private IPlanDetailManager planDetailManager;
    private PlanDetail selectedPlanDetail;
    private List<PlanDetail> planDetails = new ArrayList<PlanDetail>();
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

    public IPlanDetailManager getPlanDetailManager() {
        return planDetailManager;
    }

    public void setPlanDetailManager(IPlanDetailManager planDetailManager) {
        this.planDetailManager = planDetailManager;
    }

    public List<PlanDetail> getPlanDetails() {
    	if (sortBy == null) {
    		planDetails = getPlanDetailManager().getPlanDetails();
        } else {
        	planDetails = getPlanDetailManager().getPlanDetails(sortBy, sortOrder);
        }
        this.length = planDetails.size();
        return planDetails;
    }

    public PlanDetail getSelectedPlanDetail() {
        return selectedPlanDetail;
    }

    public void setSelectedPlanDetail(PlanDetail selectedPlanDetail) {
        this.selectedPlanDetail = selectedPlanDetail;
    }

    public void onRowSelect(SelectEvent event) throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("plandDetail.xhtml");
        setEditible(true);
    }

    public void init() throws IOException {
        setSelectedPlanDetail(null);
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
            	getPlanDetailManager().deletePlanDetail(getSelectedPlanDetail());
                break;
            case CREATE:
                setSelectedPlanDetail(new PlanDetail());
                break;
            case SAVE:
            	if (getSelectedPlanDetail().getCreated() != null) {
                    getPlanDetailManager().saveOrUpdate(getSelectedPlanDetail());
                } else {
                    getPlanDetailManager().savePlanDetail(getSelectedPlanDetail());
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
