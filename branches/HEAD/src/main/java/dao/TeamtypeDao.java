package dao;

import java.util.List;

import entry.Teamtype;

public interface TeamtypeDao {

    public List<Teamtype> getTeamtypes();

    public void createTeamtype(Teamtype teamtype);

    public void editTeamtype(Teamtype teamtype);

    public Teamtype getTeamtype(Long id);

}
