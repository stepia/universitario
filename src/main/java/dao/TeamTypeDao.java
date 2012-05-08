package dao;

import java.util.List;

import entry.TeamType;

public interface TeamTypeDao {

    public List<TeamType> getTeamTypes();

    public List<TeamType> getTeamTypes(String sortBy, boolean sortOrder);

    public void saveTeamType(TeamType teamType);

    public void editTeamType(TeamType teamType);

    public TeamType getTeamType(Long id);

    public void deleteTeamType(TeamType teamType);

    public void saveOrUpdate(TeamType teamType);

}
