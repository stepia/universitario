package dao;

import java.util.List;

import entry.Plan;

public interface PlanDao {

    public List<Plan> getPlans();

    public List<Plan> getPlans(String sortBy, boolean sortOrder);

    public void savePlan(Plan plan);

    public void editPlan(Plan plan);

    public Plan getPlan(Long id);

}
