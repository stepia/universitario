package dao;

import java.util.List;

import entry.Emp2team;

public interface Emp2teamDao {

    public List<Emp2team> getEmp2teams();

    public void createEmp2team(Emp2team emp2team);

    public void editEmp2team(Emp2team emp2team);

    public Emp2team getEmp2team(Long id);

}
