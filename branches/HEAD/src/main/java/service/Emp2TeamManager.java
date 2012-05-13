package service;

import java.util.List;

import dao.Emp2TeamDao;
import entry.Emp2Team;

public class Emp2TeamManager implements Emp2TeamDao {

    private Emp2TeamDao empTeamDao;

    public Emp2TeamDao getEmp2TeamDao() {
        return empTeamDao;
    }

    public void setEmp2TeamDao(Emp2TeamDao empTeamDao) {
        this.empTeamDao = empTeamDao;
    }

    public void saveEmp2Team(Emp2Team empTeam) {
        getEmp2TeamDao().saveEmp2Team(empTeam);
    }

    public void saveOrUpdate(Emp2Team empTeam) {
        getEmp2TeamDao().saveOrUpdate(empTeam);
    }

    public void deleteEmp2Team(Emp2Team empTeam) {
        getEmp2TeamDao().deleteEmp2Team(empTeam);
    }

    public List<Emp2Team> getEmp2Teams() {
        return getEmp2TeamDao().getEmp2Teams();
    }

    public List<Emp2Team> getEmp2Teams(String sortBy, boolean sortOrder) {
        return getEmp2TeamDao().getEmp2Teams(sortBy, sortOrder);
    }

    public void editEmp2Team(Emp2Team empTeam) {
        getEmp2TeamDao().editEmp2Team(empTeam);
    }

    public Emp2Team getEmp2Team(Long id) {
        return getEmp2TeamDao().getEmp2Team(id);
    }

}
