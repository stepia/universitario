package user;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;

import service.IPlanManager;
import entry.Plan;

@ManagedBean
@SessionScoped
public class PlanViewBean {

    @ManagedProperty(value = "#{planManager}")
    private IPlanManager planManager;
    private Plan selectedPlan;
    private Plan[] selectedPlans;
    private List<Plan> plans = new ArrayList<Plan>();
    private boolean editible;

    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Plan[] getSelectedPlans() {
        return selectedPlans;
    }

    public void setSelectedPlans(Plan[] selectedPlans) {
        this.selectedPlans = selectedPlans;
    }

    public IPlanManager getPlanManager() {
        return planManager;
    }

    public void setPlanManager(IPlanManager planManager) {
        this.planManager = planManager;
    }

    public List<Plan> getPlans() {
    	plans = planManager.getPlans();
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

    public String doAction(String action) {
        return action;
    }

}
