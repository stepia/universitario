package dao;

import java.util.List;

import entry.TeamView;

public interface TeamViewDao {

    public List<TeamView> getTeamViews();

    public List<TeamView> getTeamViews(String sortBy, boolean sortOrder);

    public void saveTeamView(TeamView teamView);

    public void editTeamView(TeamView teamView);

    public TeamView getTeamView(String teamView);

    public void deleteTeamView(TeamView teamView);

    public void saveOrUpdate(TeamView teamView);

    public List<TeamView> getParentTeamViews(int teamViewid);

    public List<TeamView> getSubTeamViews(int teamViewid);

}
