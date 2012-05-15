package service;

import java.util.List;

import dao.PlanDao;
import entry.Plan;

public class PlanManager implements PlanDao {

    private PlanDao planDao;

    public PlanDao getPlanDao() {
        return planDao;
    }

    public void setPlanDao(PlanDao planDao) {
        this.planDao = planDao;
    }

    public void savePlan(Plan plan) {
        getPlanDao().savePlan(plan);
    }

    public void saveOrUpdate(Plan plan) {
        getPlanDao().saveOrUpdate(plan);
    }

    public void deletePlan(Plan plan) {
        getPlanDao().deletePlan(plan);
    }

    public List<Plan> getPlans() {
        return getPlanDao().getPlans();
    }

    public List<Plan> getPlans(String sortBy, boolean sortOrder) {
        return getPlanDao().getPlans(sortBy, sortOrder);
    }

    public void editPlan(Plan plan) {
        getPlanDao().editPlan(plan);
    }

    public Plan getPlan(Long id) {
        return getPlanDao().getPlan(id);
    }

}