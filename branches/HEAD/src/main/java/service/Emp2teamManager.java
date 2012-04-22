package service;

import java.util.List;

import dao.Emp2teamDao;
import entry.Emp2team;

public class Emp2teamManager implements IEmp2teamManager {

    private Emp2teamDao emp2teamDao;

    public Emp2teamDao getEmp2teamDao() {
        return emp2teamDao;
    }

    public void setEmp2teamDao(Emp2teamDao emp2teamDao) {
        this.emp2teamDao = emp2teamDao;
    }

    public void createEmp2team(Emp2team emp2team) {
        getEmp2teamDao().createEmp2team(emp2team);
    }

    public List<Emp2team> getEmp2teams() {
        return getEmp2teamDao().getEmp2teams();
    }

    public void editEmp2team(Emp2team emp2team) {
        getEmp2teamDao().editEmp2team(emp2team);
    }

    public Emp2team getEmp2team(Long id) {
        return getEmp2teamDao().getEmp2team(id);
    }

}
