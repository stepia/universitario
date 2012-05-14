package dao;

import java.util.List;

import entry.TeamEmp;

public interface TeamEmpDao {

    public List<TeamEmp> getTeamEmps();

    public List<TeamEmp> getTeamEmps(String sortBy, boolean sortOrder);

    public void saveTeamEmp(TeamEmp empTeam);

    public void editTeamEmp(TeamEmp empTeam);

    public TeamEmp getTeamEmp(Long id);

    public void deleteTeamEmp(TeamEmp empTeam);

    public void saveOrUpdate(TeamEmp empTeam);

}
