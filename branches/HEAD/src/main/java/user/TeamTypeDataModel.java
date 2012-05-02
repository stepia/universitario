package user;

import java.util.List;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

import entry.TeamType;

public class TeamTypeDataModel extends ListDataModel<TeamType> implements SelectableDataModel<TeamType> {

    public TeamTypeDataModel() {
    }

    public TeamTypeDataModel(List<TeamType> data) {
        super(data);
    }

    public TeamType getRowData(String rowKey) {
    	Long id = Long.valueOf(rowKey);

        @SuppressWarnings("unchecked")
        List<TeamType> teamTypes = (List<TeamType>) getWrappedData();

        for (TeamType teamType : teamTypes) {
            if (teamType.getId().equals(id))
                return teamType;
        }

        return null;
    }

    public Long getRowKey(TeamType teamType) {
        return teamType.getId();
    }
}
