package user;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import org.primefaces.event.SelectEvent;
import org.primefaces.event.data.SortEvent;

import dao.EmpTeamDao;
import entry.EmpTeam;

@ManagedBean
@SessionScoped
public class FacultyViewBean {

    @ManagedProperty(value = "#{empTeamManager}")
    private EmpTeamDao empTeamManager;
    private EmpTeam selectedFaculty;
    private List<EmpTeam> faculties = new ArrayList<EmpTeam>();
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

    public List<EmpTeam> getFaculties() {
        if (sortBy == null) {
            faculties = getEmpTeamManager().getEmpTeams();
        } else {
            if (!sortBy.equals("person")) {
                faculties = getEmpTeamManager().getEmpTeams(sortBy, sortOrder);
            }
        }
        this.length = faculties.size();
        return faculties;
    }

    public EmpTeam getSelectedFaculty() {
        return selectedFaculty;
    }

    public void setSelectedFaculty(EmpTeam selectedFaculties) {
        this.selectedFaculty = selectedFaculties;
    }

    public void onRowSelect(SelectEvent event) throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("empTeamDetail.xhtml");
        setEditible(true);
    }

    public void init() throws IOException {
        setSelectedFaculty(null);
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
                getEmpTeamManager().deleteEmpTeam(getSelectedFaculty());
                break;
            case CREATE:
                setSelectedFaculty(new EmpTeam());
                break;
            case SAVE:
                if (getSelectedFaculty().getCreated() != null) {
                    getEmpTeamManager().saveOrUpdate(getSelectedFaculty());
                } else {
                    getEmpTeamManager().saveEmpTeam(getSelectedFaculty());
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

    public EmpTeamDao getEmpTeamManager() {
        return empTeamManager;
    }

    public void setEmpTeamManager(EmpTeamDao EmpTeamManager) {
        this.empTeamManager = EmpTeamManager;
    }

}
