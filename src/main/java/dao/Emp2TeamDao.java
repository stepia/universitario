package dao;

import java.util.List;

import entry.Emp2Team;

public interface Emp2TeamDao {

    public List<Emp2Team> getEmp2Teams();

    public List<Emp2Team> getEmp2Teams(String sortBy, boolean sortOrder);

    public void saveEmp2Team(Emp2Team empTeam);

    public void editEmp2Team(Emp2Team empTeam);

    public Emp2Team getEmp2Team(Long id);

    public void deleteEmp2Team(Emp2Team empTeam);

    public void saveOrUpdate(Emp2Team empTeam);

}
