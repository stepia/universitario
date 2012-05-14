package dao;

import java.util.List;

import entry.EmpTeam;

public interface EmpTeamDao {

    public List<EmpTeam> getEmpTeams();

    public List<EmpTeam> getEmpTeams(String sortBy, boolean sortOrder);

    public void saveEmpTeam(EmpTeam empTeam);

    public void editEmpTeam(EmpTeam empTeam);

    public EmpTeam getEmpTeam(Long id);

    public void deleteEmpTeam(EmpTeam empTeam);

    public void saveOrUpdate(EmpTeam empTeam);

}
