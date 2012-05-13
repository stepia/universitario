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

import dao.PlanDao;
import entry.Plan;

@ManagedBean
@SessionScoped
public class PlanViewBean {

    @ManagedProperty(value = "#{planManager}")
    private PlanDao planManager;
    private Plan selectedPlan;
    private List<Plan> plans = new ArrayList<Plan>();
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

    public PlanDao getPlanManager() {
        return planManager;
    }

    public void setPlanManager(PlanDao planManager) {
        this.planManager = planManager;
    }

    public List<Plan> getPlans() {
        if (sortBy == null) {
            plans = getPlanManager().getPlans();
        } else {
            plans = getPlanManager().getPlans(sortBy, sortOrder);
        }
        this.length = plans.size();
        return plans;
    }

    public Plan getSelectedPlan() {
        return selectedPlan;
    }

    public void setSelectedPlan(Plan selectedPlan) {
        this.selectedPlan = selectedPlan;
    }

    public void onRowSelect(SelectEvent event) throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("planDetail.xhtml");
        setEditible(true);
    }

    public void init() throws IOException {
        setSelectedPlan(null);
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
                getPlanManager().deletePlan(getSelectedPlan());
                break;
            case CREATE:
                setSelectedPlan(new Plan());
                break;
            case SAVE:
                if (getSelectedPlan().getCreated() != null) {
                    getPlanManager().saveOrUpdate(getSelectedPlan());
                } else {
                    getPlanManager().savePlan(getSelectedPlan());
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
