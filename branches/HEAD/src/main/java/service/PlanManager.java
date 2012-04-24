package service;

import java.util.List;

import dao.PlanDao;
import entry.Plan;

public class PlanManager implements IPlanManager {

    private PlanDao planDao;

    public PlanDao getPlanDao() {
        return planDao;
    }

    public void setPlanDao(PlanDao planDao) {
        this.planDao = planDao;
    }

    public void createPlan(Plan plan) {
        getPlanDao().createPlan(plan);
    }

    public List<Plan> getPlans() {
        return getPlanDao().getPlans();
    }

    public void editPlan(Plan plan) {
        getPlanDao().editPlan(plan);
    }

    public Plan getPlan(Long id) {
        return getPlanDao().getPlan(id);
    }

}
