package service;

import java.util.List;

import dao.EmpTeamDao;
import entry.EmpTeam;

public class EmpTeamManager implements EmpTeamDao {

    private EmpTeamDao empTeamDao;

    public EmpTeamDao getEmpTeamDao() {
        return empTeamDao;
    }

    public void setEmpTeamDao(EmpTeamDao empTeamDao) {
        this.empTeamDao = empTeamDao;
    }

    public void saveEmpTeam(EmpTeam empTeam) {
        getEmpTeamDao().saveEmpTeam(empTeam);
    }

    public void saveOrUpdate(EmpTeam empTeam) {
        getEmpTeamDao().saveOrUpdate(empTeam);
    }

    public void deleteEmpTeam(EmpTeam empTeam) {
        getEmpTeamDao().deleteEmpTeam(empTeam);
    }

    public List<EmpTeam> getEmpTeams() {
        return getEmpTeamDao().getEmpTeams();
    }

    public List<EmpTeam> getEmpTeams(String sortBy, boolean sortOrder) {
        return getEmpTeamDao().getEmpTeams(sortBy, sortOrder);
    }

    public void editEmpTeam(EmpTeam empTeam) {
        getEmpTeamDao().editEmpTeam(empTeam);
    }

    public EmpTeam getEmpTeam(Long id) {
        return getEmpTeamDao().getEmpTeam(id);
    }

}
