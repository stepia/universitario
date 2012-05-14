package service;

import java.util.List;

import dao.TeamViewDao;
import entry.TeamView;

public class TeamViewManager implements TeamViewDao {

    private TeamViewDao TeamViewDao;

    public TeamViewDao getTeamViewDao() {
        return TeamViewDao;
    }

    public void setTeamViewDao(TeamViewDao teamViewDao) {
        this.TeamViewDao = teamViewDao;
    }

    public void saveTeamView(TeamView teamView) {
        getTeamViewDao().saveTeamView(teamView);
    }

    public void saveOrUpdate(TeamView teamView) {
        getTeamViewDao().saveOrUpdate(teamView);
    }

    public void deleteTeamView(TeamView teamView) {
        getTeamViewDao().deleteTeamView(teamView);
    }

    public List<TeamView> getTeamViews() {
        return getTeamViewDao().getTeamViews();
    }

    public List<TeamView> getTeamViews(String sortBy, boolean sortOrder) {
        return getTeamViewDao().getTeamViews(sortBy, sortOrder);
    }

    public void editTeamView(TeamView teamView) {
        getTeamViewDao().editTeamView(teamView);
    }

    public TeamView getTeamView(String name) {
        return getTeamViewDao().getTeamView(name);
    }

    public List<TeamView> getParentTeamViews(int teamViewId) {
        return getTeamViewDao().getParentTeamViews(teamViewId);
    }

    public List<TeamView> getSubTeamViews(int teamViewId) {
        return getTeamViewDao().getSubTeamViews(teamViewId);
    }

}
