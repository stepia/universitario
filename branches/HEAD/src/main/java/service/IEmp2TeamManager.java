package service;

import java.util.List;

import entry.Emp2Team;

public interface IEmp2TeamManager {

    public List<Emp2Team> getEmp2Teams();

    public void createEmp2Team(Emp2Team empTeam);

    public void editEmp2Team(Emp2Team empTeam);

}
