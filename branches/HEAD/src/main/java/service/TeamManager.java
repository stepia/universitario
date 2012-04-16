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

    public void createTeam(Team team) {
        getTeamDao().createTeam(team);
    }

    public List<Team> getTeams() {
        return getTeamDao().getTeams();
    }

    public void editTeam(Team team) {
        getTeamDao().editTeam(team);
    }

    public Team getTeam(String name) {
        return getTeamDao().getTeam(name);
    }

}
