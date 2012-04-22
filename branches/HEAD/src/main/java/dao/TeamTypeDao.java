package dao;

import java.util.List;

import entry.TeamType;

public interface TeamTypeDao {

    public List<TeamType> getTeamTypes();

    public void createTeamType(TeamType teamType);

    public void editTeamType(TeamType teamType);

    public TeamType getTeamType(Long id);

}
