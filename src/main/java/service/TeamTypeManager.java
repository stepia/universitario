package service;

import java.util.List;

import dao.TeamTypeDao;
import entry.TeamType;

public class TeamTypeManager implements ITeamTypeManager {

    private TeamTypeDao teamTypeDao;

    public TeamTypeDao getTeamTypeDao() {
        return teamTypeDao;
    }

    public void setTeamTypeDao(TeamTypeDao teamTypeDao) {
        this.teamTypeDao = teamTypeDao;
    }

    public void createTeamType(TeamType teamType) {
        getTeamTypeDao().createTeamType(teamType);
    }

    public List<TeamType> getTeamTypes() {
        return getTeamTypeDao().getTeamTypes();
    }

    public void editTeamType(TeamType teamType) {
        getTeamTypeDao().editTeamType(teamType);
    }

    public TeamType getTeamType(Long id) {
        return getTeamTypeDao().getTeamType(id);
    }

}
