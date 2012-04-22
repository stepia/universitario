package service;

import java.util.List;

import entry.TeamType;

public interface ITeamTypeManager {

    public List<TeamType> getTeamTypes();

    public void createTeamType(TeamType teamType);

    public void editTeamType(TeamType teamType);

}
