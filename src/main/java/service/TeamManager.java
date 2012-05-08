package service;

import java.util.List;

import dao.TeamDao;
import entry.Team;

public class TeamManager implements ITeamManager {

    private TeamDao teamDao;

    public TeamDao getTeamDao() {
        return teamDao;
    }

    public void setTeamDao(TeamDao teamDao) {
        this.teamDao = teamDao;
    }

    public void saveTeam(Team team) {
        getTeamDao().saveTeam(team);
    }

    public void saveOrUpdate(Team team) {
        getTeamDao().saveOrUpdate(team);
    }

    public void deleteTeam(Team team) {
        getTeamDao().deleteTeam(team);
    }

    public List<Team> getTeams() {
        return getTeamDao().getTeams();
    }

    public List<Team> getTeams(String sortBy, boolean sortOrder) {
        return getTeamDao().getTeams(sortBy, sortOrder);
    }

    public void editTeam(Team team) {
        getTeamDao().editTeam(team);
    }

    public Team getTeam(String name) {
        return getTeamDao().getTeam(name);
    }

    public List<Team> getParentTeams(int teamId) {
        return getTeamDao().getParentTeams(teamId);
    }
    
    public List<Team> getSubTeams(int teamId) {
        return getTeamDao().getSubTeams(teamId);
    }

}
