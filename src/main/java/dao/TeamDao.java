package dao;

import java.util.List;

import entry.Team;

public interface TeamDao {

    public List<Team> getTeams();

    public void createTeam(Team team);

    public void editTeam(Team team);

    public Team getTeam(String name);

    public List<Team> getParentTeams(int teamid);

    public List<Team> getSubTeams(int teamid);

}
