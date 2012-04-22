package service;

import java.util.List;

import dao.TeamtypeDao;
import entry.Teamtype;

public class TeamtypeManager implements ITeamtypeManager {

    private TeamtypeDao teamtypeDao;

    public TeamtypeDao getTeamtypeDao() {
        return teamtypeDao;
    }

    public void setTeamtypeDao(TeamtypeDao teamtypeDao) {
        this.teamtypeDao = teamtypeDao;
    }

    public void createTeamtype(Teamtype teamtype) {
        getTeamtypeDao().createTeamtype(teamtype);
    }

    public List<Teamtype> getTeamtypes() {
        return getTeamtypeDao().getTeamtypes();
    }

    public void editTeamtype(Teamtype teamtype) {
        getTeamtypeDao().editTeamtype(teamtype);
    }

    public Teamtype getTeamtype(Long id) {
        return getTeamtypeDao().getTeamtype(id);
    }

}
