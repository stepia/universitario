package service;

import java.util.List;

import dao.TeamEmpDao;
import entry.TeamEmp;

public class TeamEmpManager implements TeamEmpDao {

    private TeamEmpDao teamEmpDao;

    public TeamEmpDao getTeamEmpDao() {
        return teamEmpDao;
    }

    public void setTeamEmpDao(TeamEmpDao empTeamDao) {
        this.teamEmpDao = empTeamDao;
    }

    public void saveTeamEmp(TeamEmp empTeam) {
        getTeamEmpDao().saveTeamEmp(empTeam);
    }

    public void saveOrUpdate(TeamEmp empTeam) {
        getTeamEmpDao().saveOrUpdate(empTeam);
    }

    public void deleteTeamEmp(TeamEmp empTeam) {
        getTeamEmpDao().deleteTeamEmp(empTeam);
    }

    public List<TeamEmp> getTeamEmps() {
        return getTeamEmpDao().getTeamEmps();
    }

    public List<TeamEmp> getTeamEmps(String sortBy, boolean sortOrder) {
        return getTeamEmpDao().getTeamEmps(sortBy, sortOrder);
    }

    public void editTeamEmp(TeamEmp empTeam) {
        getTeamEmpDao().editTeamEmp(empTeam);
    }

    public TeamEmp getTeamEmp(Long id) {
        return getTeamEmpDao().getTeamEmp(id);
    }

}
