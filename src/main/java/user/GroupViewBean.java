package user;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import org.primefaces.event.SelectEvent;
import org.primefaces.event.data.SortEvent;

import dao.TeamViewDao;
import entry.TeamView;

@ManagedBean
@SessionScoped
public class GroupViewBean {

    @ManagedProperty(value = "#{teamViewManager}")
    private TeamViewDao teamViewManager;
    private TeamView selectedTeam;
    private List<TeamView> teams = new ArrayList<TeamView>();
    private boolean editible;
    private boolean sortOrder;
    private String sortBy;
    private SelectItem[] enabledOptions = new SelectItem[3];

    public SelectItem[] getEnabledOptions() {
        return enabledOptions;
    }

    public void setEnabledOptions(SelectItem[] enabledOptions) {
        this.enabledOptions = enabledOptions;
    }

    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public List<TeamView> getTeams() {
        if (sortBy == null) {
            teams = getTeamViewManager().getTeamViews(5);
        } else {
            if (!sortBy.equals("person")) {
                teams = getTeamViewManager().getTeamViews(5, sortBy, sortOrder);
            }
        }
        this.length = teams.size();
        return teams;
    }

    public void onRowSelect(SelectEvent event) throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("groupDetail.xhtml");
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

    public TeamViewDao getTeamViewManager() {
        return teamViewManager;
    }

    public void setTeamViewManager(TeamViewDao teamViewManager) {
        this.teamViewManager = teamViewManager;
    }

    public TeamView getSelectedTeam() {
        return selectedTeam;
    }

    public void setSelectedTeam(TeamView selectedTeam) {
        this.selectedTeam = selectedTeam;
    }

}
