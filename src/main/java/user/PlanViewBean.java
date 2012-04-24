package user;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import service.IPlanManager;
import entry.Plan;

@ManagedBean
@RequestScoped
public class PlanViewBean {

    private Plan plan;
    @ManagedProperty(value = "#{planManager}")
    private IPlanManager planManager;
    private Plan selectedPlan;
    private Plan[] selectedPlans;
    private List<Plan> plans = new ArrayList<Plan>();

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

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

}
