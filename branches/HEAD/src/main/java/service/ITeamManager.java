package service;

import java.util.List;

import entry.Team;

public interface ITeamManager {

    public List<Team> getTeams();

    public void createTeam(Team team);

    public void editTeam(Team team);

}
