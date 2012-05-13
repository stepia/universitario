package service;

import java.util.List;

import dao.Emp2TeamIPersonDao;
import entry.Emp2TeamIPerson;

public class Emp2TeamIPersonManager implements Emp2TeamIPersonDao {

    private Emp2TeamIPersonDao empTeamIPersonDao;

    public Emp2TeamIPersonDao getEmp2TeamIPersonDao() {
        return empTeamIPersonDao;
    }

    public void setEmp2TeamIPersonDao(Emp2TeamIPersonDao empTeamDao) {
        this.empTeamIPersonDao = empTeamDao;
    }

    public void saveEmp2TeamIPerson(Emp2TeamIPerson empTeam) {
        getEmp2TeamIPersonDao().saveEmp2TeamIPerson(empTeam);
    }

    public void saveOrUpdate(Emp2TeamIPerson empTeam) {
        getEmp2TeamIPersonDao().saveOrUpdate(empTeam);
    }

    public void deleteEmp2TeamIPerson(Emp2TeamIPerson empTeam) {
        getEmp2TeamIPersonDao().deleteEmp2TeamIPerson(empTeam);
    }

    public List<Emp2TeamIPerson> getEmp2TeamIPersons() {
        return getEmp2TeamIPersonDao().getEmp2TeamIPersons();
    }

    public List<Emp2TeamIPerson> getEmp2TeamIPersons(String sortBy, boolean sortOrder) {
        return getEmp2TeamIPersonDao().getEmp2TeamIPersons(sortBy, sortOrder);
    }

    public void editEmp2TeamIPerson(Emp2TeamIPerson empTeam) {
        getEmp2TeamIPersonDao().editEmp2TeamIPerson(empTeam);
    }

    public Emp2TeamIPerson getEmp2TeamIPerson(Long id) {
        return getEmp2TeamIPersonDao().getEmp2TeamIPerson(id);
    }

}
