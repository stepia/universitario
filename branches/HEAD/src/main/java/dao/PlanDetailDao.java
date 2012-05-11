package dao;

import java.util.List;

import entry.PlanDetail;

public interface PlanDetailDao {

    public List<PlanDetail> getPlanDetails();

    public List<PlanDetail> getPlanDetails(String sortBy, boolean sortOrder);

    public void savePlanDetail(PlanDetail planDetail);

    public void editPlanDetail(PlanDetail planDetail);

    public PlanDetail getPlanDetail(Long id);

    public void deletePlanDetail(PlanDetail planDetail);

    public void saveOrUpdate(PlanDetail planDetail);

}
