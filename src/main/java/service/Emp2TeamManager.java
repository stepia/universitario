package service;

import java.util.List;

import dao.Emp2TeamDao;
import entry.Emp2Team;

public class Emp2TeamManager implements IEmp2TeamManager {

    private Emp2TeamDao empTeamDao;

    public Emp2TeamDao getEmp2TeamDao() {
        return empTeamDao;
    }

    public void setEmp2TeamDao(Emp2TeamDao empTeamDao) {
        this.empTeamDao = empTeamDao;
    }

    public void createEmp2Team(Emp2Team empTeam) {
        getEmp2TeamDao().createEmp2Team(empTeam);
    }

    public List<Emp2Team> getEmp2Teams() {
        return getEmp2TeamDao().getEmp2Teams();
    }

    public void editEmp2Team(Emp2Team empTeam) {
        getEmp2TeamDao().editEmp2Team(empTeam);
    }

    public Emp2Team getEmp2Team(Long id) {
        return getEmp2TeamDao().getEmp2Team(id);
    }

}
