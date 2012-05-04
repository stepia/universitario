package user;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;

import service.ITeamTypeManager;
import entry.TeamType;

@ManagedBean
@SessionScoped
public class TeamTypeViewBean {

    @ManagedProperty(value = "#{teamTypeManager}")
    private ITeamTypeManager teamTypeManager;
    private TeamType selectedTeamType;
    private TeamType[] selectedTeamTypes;
    private List<TeamType> teamTypes = new ArrayList<TeamType>();
    private boolean editible;

    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public TeamType[] getSelectedTeamTypes() {
        return selectedTeamTypes;
    }

    public void setSelectedTeamTypes(TeamType[] selectedTeamTypes) {
        this.selectedTeamTypes = selectedTeamTypes;
    }

    public ITeamTypeManager getTeamTypeManager() {
        return teamTypeManager;
    }

    public void setTeamTypeManager(ITeamTypeManager teamTypeManager) {
        this.teamTypeManager = teamTypeManager;
    }

    public List<TeamType> getTeamTypes() {
    	teamTypes = teamTypeManager.getTeamTypes();
        this.length = teamTypes.size();
        return teamTypes;
    }

    public TeamType getSelectedTeamType() {
        return selectedTeamType;
    }

    public void setSelectedTeamType(TeamType selectedTeamType) {
        this.selectedTeamType = selectedTeamType;
    }

    public void onRowSelect(SelectEvent event) throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("teamtypeDetail.xhtml");
        setEditible(true);
    }

    public void init() throws IOException {
        setSelectedTeamType(null);
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
