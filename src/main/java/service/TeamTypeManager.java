package service;

import java.util.List;

import dao.TeamTypeDao;
import entry.TeamType;

public class TeamTypeManager implements TeamTypeDao {

    private TeamTypeDao teamTypeDao;

    public TeamTypeDao getTeamTypeDao() {
        return teamTypeDao;
    }

    public void setTeamTypeDao(TeamTypeDao teamTypeDao) {
        this.teamTypeDao = teamTypeDao;
    }

    public void saveTeamType(TeamType teamType) {
        getTeamTypeDao().saveTeamType(teamType);
    }

    public void saveOrUpdate(TeamType teamType) {
        getTeamTypeDao().saveOrUpdate(teamType);
    }

    public void deleteTeamType(TeamType teamType) {
        getTeamTypeDao().deleteTeamType(teamType);
    }

    public List<TeamType> getTeamTypes() {
        return getTeamTypeDao().getTeamTypes();
    }

    public List<TeamType> getTeamTypes(String sortBy, boolean sortOrder) {
        return getTeamTypeDao().getTeamTypes(sortBy, sortOrder);
    }

    public void editTeamType(TeamType teamType) {
        getTeamTypeDao().editTeamType(teamType);
    }

    public TeamType getTeamType(Long id) {
        return getTeamTypeDao().getTeamType(id);
    }

}
