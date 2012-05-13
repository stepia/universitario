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

import dao.TeamTypeDao;
import entry.TeamType;

@ManagedBean
@SessionScoped
public class TeamTypeViewBean {

    @ManagedProperty(value = "#{teamTypeManager}")
    private TeamTypeDao teamTypeManager;
    private TeamType selectedTeamType;
    private List<TeamType> teamTypes = new ArrayList<TeamType>();
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

    public TeamTypeDao getTeamTypeManager() {
        return teamTypeManager;
    }

    public void setTeamTypeManager(TeamTypeDao teamTypeManager) {
        this.teamTypeManager = teamTypeManager;
    }

    public List<TeamType> getTeamTypes() {
        if (sortBy == null) {
            teamTypes = getTeamTypeManager().getTeamTypes();
        } else {
            teamTypes = getTeamTypeManager().getTeamTypes(sortBy, sortOrder);
        }
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

    public String doAction(String action) throws UnsupportedEncodingException {
        Action act = Action.fromString(action);
        switch (act)
            {
            case DELETE:
                getTeamTypeManager().deleteTeamType(getSelectedTeamType());
                break;
            case CREATE:
                setSelectedTeamType(new TeamType());
                break;
            case SAVE:
                if (getSelectedTeamType().getCreated() != null) {
                    getTeamTypeManager().saveOrUpdate(getSelectedTeamType());
                } else {
                    getTeamTypeManager().saveTeamType(getSelectedTeamType());
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
