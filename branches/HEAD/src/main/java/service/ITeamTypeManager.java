package service;

import java.util.List;

import entry.TeamType;

public interface ITeamTypeManager {

    public List<TeamType> getTeamTypes();

    public void saveTeamType(TeamType teamType);

    public void editTeamType(TeamType teamType);

    public List<TeamType> getTeamTypes(String sortBy, boolean sortOrder);

}
