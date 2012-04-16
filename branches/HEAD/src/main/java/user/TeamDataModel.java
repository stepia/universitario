package user;

import java.util.List;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

import entry.Team;

public class TeamDataModel extends ListDataModel<Team> implements SelectableDataModel<Team> {

    public TeamDataModel() {
    }

    public TeamDataModel(List<Team> data) {
        super(data);
    }

    public Team getRowData(String rowKey) {

        @SuppressWarnings("unchecked")
        List<Team> teams = (List<Team>) getWrappedData();

        for (Team team : teams) {
            if (team.getName().equals(rowKey))
                return team;
        }

        return null;
    }

    public String getRowKey(Team team) {
        return team.getName();
    }
}
