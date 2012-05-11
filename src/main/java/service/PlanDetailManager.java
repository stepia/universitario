package service;

import java.util.List;

import dao.PlanDetailDao;
import entry.PlanDetail;

public class PlanDetailManager implements IPlanDetailManager {

    private PlanDetailDao planDetailDao;

    public PlanDetailDao getPlanDetailDao() {
        return planDetailDao;
    }

    public void setPlanDetailDao(PlanDetailDao planDetailDao) {
        this.planDetailDao = planDetailDao;
    }

    public void savePlanDetail(PlanDetail planDetail) {
        getPlanDetailDao().savePlanDetail(planDetail);
    }

    public void saveOrUpdate(PlanDetail planDetail) {
        getPlanDetailDao().saveOrUpdate(planDetail);
    }

    public void deletePlanDetail(PlanDetail planDetail) {
        getPlanDetailDao().deletePlanDetail(planDetail);
    }

    public List<PlanDetail> getPlanDetails() {
        return getPlanDetailDao().getPlanDetails();
    }

    public List<PlanDetail> getPlanDetails(String sortBy, boolean sortOrder) {
        return getPlanDetailDao().getPlanDetails(sortBy, sortOrder);
    }

    public void editPlanDetail(PlanDetail planDetail) {
        getPlanDetailDao().editPlanDetail(planDetail);
    }

    public PlanDetail getPlanDetail(Long id) {
        return getPlanDetailDao().getPlanDetail(id);
    }

}
