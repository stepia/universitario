package service;

import java.util.List;

import entry.PlanDetail;

public interface IPlanDetailManager {

    public List<PlanDetail> getPlanDetails();

    public void savePlanDetail(PlanDetail planDetail);

    public void editPlanDetail(PlanDetail planDetail);

    public List<PlanDetail> getPlanDetails(String sortBy, boolean sortOrder);

    public void deletePlanDetail(PlanDetail planDetail);

    public void saveOrUpdate(PlanDetail planDetail);

}
