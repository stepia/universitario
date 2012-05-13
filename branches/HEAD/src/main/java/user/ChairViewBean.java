package user;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import dao.TeamDao;
import entry.Team;

@ManagedBean
@RequestScoped
public class ChairViewBean {

    @ManagedProperty(value = "#{chair}")
    private Team team;
    @ManagedProperty(value = "#{teamManager}")
    private TeamDao teamManager;
    private Team selectedTeam;
    private Team[] selectedTeams;
    private List<Team> teams = new ArrayList<Team>();

    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Team[] getSelectedTeams() {
        return selectedTeams;
    }

    public void setSelectedTeams(Team[] selectedTeams) {
        this.selectedTeams = selectedTeams;
    }

    public TeamDao getTeamManager() {
        return teamManager;
    }

    public void setTeamManager(TeamDao teamManager) {
        this.teamManager = teamManager;
    }

    public List<Team> getTeams() {
        teams = teamManager.getTeams();
        this.length = teams.size();
        return teams;
    }

    public Team getSelectedTeam() {
        return selectedTeam;
    }

    public void setSelectedTeam(Team selectedTeam) {
        this.selectedTeam = selectedTeam;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

}
