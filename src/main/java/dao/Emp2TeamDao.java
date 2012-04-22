package dao;

import java.util.List;

import entry.Emp2Team;

public interface Emp2TeamDao {

    public List<Emp2Team> getEmp2Teams();

    public void createEmp2Team(Emp2Team empteam);

    public void editEmp2Team(Emp2Team empteam);

    public Emp2Team getEmp2Team(Long id);

}
