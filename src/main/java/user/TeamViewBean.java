package user;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;

import service.ITeamManager;
import entry.Team;

@ManagedBean
@SessionScoped
public class TeamViewBean {

    @ManagedProperty(value = "#{teamManager}")
    private ITeamManager teamManager;
    private Team selectedTeam;
    private Team[] selectedTeams;
    private List<Team> teams = new ArrayList<Team>();
    private boolean editible;

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

    public ITeamManager getTeamManager() {
        return teamManager;
    }

    public void setTeamManager(ITeamManager teamManager) {
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

    public void onRowSelect(SelectEvent event) throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("teamPrimeDetail.xhtml");
        setEditible(true);
    }

    public void init() throws IOException {
        setSelectedTeam(null);
        setEditible(false);
    }

    public boolean isEditible() {
        return editible;
    }

    public void setEditible(boolean editible) {
        this.editible = editible;
    }

    public String doAction(String action) {
        return action;
    }

}
