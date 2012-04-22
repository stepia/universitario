package service;

import java.util.List;

import entry.Emp2team;

public interface IEmp2teamManager {

    public List<Emp2team> getEmp2teams();

    public void createEmp2team(Emp2team emp2team);

    public void editEmp2team(Emp2team emp2team);

}
