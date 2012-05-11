package user;

import java.util.List;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

import entry.PlanDetail;

public class PlanDetailDataModel extends ListDataModel<PlanDetail> implements SelectableDataModel<PlanDetail> {

    public PlanDetailDataModel() {
    }

    public PlanDetailDataModel(List<PlanDetail> data) {
        super(data);
    }

    public PlanDetail getRowData(String rowKey) {
    	Long id = Long.valueOf(rowKey);

        @SuppressWarnings("unchecked")
        List<PlanDetail> planDetails = (List<PlanDetail>) getWrappedData();

        for (PlanDetail planDetail : planDetails) {
            if (planDetail.getId().equals(id))
                return planDetail;
        }

        return null;
    }

    public Long getRowKey(PlanDetail planDetail) {
        return planDetail.getId();
    }
}
