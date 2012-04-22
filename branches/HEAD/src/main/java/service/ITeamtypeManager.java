package service;

import java.util.List;

import entry.Teamtype;

public interface ITeamtypeManager {

    public List<Teamtype> getTeamtypes();

    public void createTeamtype(Teamtype teamtype);

    public void editTeamtype(Teamtype teamtype);

}
