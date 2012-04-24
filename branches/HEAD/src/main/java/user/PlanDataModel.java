package user;

import java.util.List;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

import entry.Plan;

public class PlanDataModel extends ListDataModel<Plan> implements SelectableDataModel<Plan> {

    public PlanDataModel() {
    }

    public PlanDataModel(List<Plan> data) {
        super(data);
    }

    public Plan getRowData(String rowKey) {

        @SuppressWarnings("unchecked")
        List<Plan> plans = (List<Plan>) getWrappedData();

        for (Plan plan : plans) {
            if (plan.getId().equals(rowKey))
                return plan;
        }

        return null;
    }

    public Long getRowKey(Plan plan) {
        return plan.getId();
    }
}
