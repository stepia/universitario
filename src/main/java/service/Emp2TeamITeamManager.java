package service;

import java.util.List;

import dao.Emp2TeamITeamDao;
import entry.Emp2TeamITeam;

public class Emp2TeamITeamManager implements Emp2TeamITeamDao {

    private Emp2TeamITeamDao empTeamITeamDao;

    public Emp2TeamITeamDao getEmp2TeamITeamDao() {
        return empTeamITeamDao;
    }

    public void setEmp2TeamITeamDao(Emp2TeamITeamDao empTeamDao) {
        this.empTeamITeamDao = empTeamDao;
    }

    public void saveEmp2TeamITeam(Emp2TeamITeam empTeam) {
        getEmp2TeamITeamDao().saveEmp2TeamITeam(empTeam);
    }

    public void saveOrUpdate(Emp2TeamITeam empTeam) {
        getEmp2TeamITeamDao().saveOrUpdate(empTeam);
    }

    public void deleteEmp2TeamITeam(Emp2TeamITeam empTeam) {
        getEmp2TeamITeamDao().deleteEmp2TeamITeam(empTeam);
    }

    public List<Emp2TeamITeam> getEmp2TeamITeams() {
        return getEmp2TeamITeamDao().getEmp2TeamITeams();
    }

    public List<Emp2TeamITeam> getEmp2TeamITeams(String sortBy, boolean sortOrder) {
        return getEmp2TeamITeamDao().getEmp2TeamITeams(sortBy, sortOrder);
    }

    public void editEmp2TeamITeam(Emp2TeamITeam empTeam) {
        getEmp2TeamITeamDao().editEmp2TeamITeam(empTeam);
    }

    public Emp2TeamITeam getEmp2TeamITeam(Long id) {
        return getEmp2TeamITeamDao().getEmp2TeamITeam(id);
    }

}
