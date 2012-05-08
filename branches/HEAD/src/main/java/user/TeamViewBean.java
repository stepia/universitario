package user;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;
import org.primefaces.event.data.SortEvent;

import service.ITeamManager;
import entry.Team;

@ManagedBean
@SessionScoped
public class TeamViewBean {

    @ManagedProperty(value = "#{teamManager}")
    private ITeamManager teamManager;
    private Team selectedTeam;
    private List<Team> teams = new ArrayList<Team>();
    private boolean editible;
    private boolean sortOrder;
    private String sortBy;

    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public ITeamManager getTeamManager() {
        return teamManager;
    }

    public void setTeamManager(ITeamManager teamManager) {
        this.teamManager = teamManager;
    }

    public List<Team> getTeams() {
    	if (sortBy == null) {
    		teams = getTeamManager().getTeams();
        } else {
        	teams = getTeamManager().getTeams(sortBy, sortOrder);
        }
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

    public String doAction(String action) throws UnsupportedEncodingException {
        Action act = Action.fromString(action);
        switch (act)
            {
            case DELETE:
            	getTeamManager().deleteTeam(getSelectedTeam());
                break;
            case CREATE:
                setSelectedTeam(new Team());
                break;
            case SAVE:
            	if (getSelectedTeam().getCreated() != null) {
                    getTeamManager().saveOrUpdate(getSelectedTeam());
                } else {
                    getTeamManager().saveTeam(getSelectedTeam());
                }
                break;
            }
        return action;
    }
    
    public void caseListSortListner(SortEvent sortEvent) {
        setSortBy(sortEvent.getSortColumn().getId());
        if (sortEvent.isAscending()) {
            setSortOrder(true);
        } else {
            setSortOrder(false);
        }
    }

    public boolean isSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(boolean sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

}
