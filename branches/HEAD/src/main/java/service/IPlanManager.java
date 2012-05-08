package service;

import java.util.List;

import entry.Plan;

public interface IPlanManager {

    public List<Plan> getPlans();

    public void savePlan(Plan plan);

    public void editPlan(Plan plan);

    public List<Plan> getPlans(String sortBy, boolean sortOrder);

    public void deletePlan(Plan plan);

    public void saveOrUpdate(Plan plan);

}
