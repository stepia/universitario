package dao;

import java.util.List;

import entry.Emp2TeamITeam;

public interface Emp2TeamITeamDao {

    public List<Emp2TeamITeam> getEmp2TeamITeams();

    public List<Emp2TeamITeam> getEmp2TeamITeams(String sortBy, boolean sortOrder);

    public void saveEmp2TeamITeam(Emp2TeamITeam empTeam);

    public void editEmp2TeamITeam(Emp2TeamITeam empTeam);

    public Emp2TeamITeam getEmp2TeamITeam(Long id);

    public void deleteEmp2TeamITeam(Emp2TeamITeam empTeam);

    public void saveOrUpdate(Emp2TeamITeam empTeam);

}
