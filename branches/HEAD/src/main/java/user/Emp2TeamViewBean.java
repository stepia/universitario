package user;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;
import org.primefaces.event.data.SortEvent;

import service.IEmp2TeamManager;
import entry.Emp2Team;

@ManagedBean
@SessionScoped
public class Emp2TeamViewBean {

    @ManagedProperty(value = "#{emp2TeamManager}")
    private IEmp2TeamManager emp2TeamManager;
    private Emp2Team selectedEmp2Team;
    private List<Emp2Team> emp2Teams = new ArrayList<Emp2Team>();
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

    public IEmp2TeamManager getEmp2TeamManager() {
        return emp2TeamManager;
    }

    public void setEmp2TeamManager(IEmp2TeamManager emp2TeamManager) {
        this.emp2TeamManager = emp2TeamManager;
    }

    public List<Emp2Team> getEmp2Teams() {
    	if (sortBy == null) {
    		emp2Teams = getEmp2TeamManager().getEmp2Teams();
        } else {
        	emp2Teams = getEmp2TeamManager().getEmp2Teams(sortBy, sortOrder);
        }
        this.length = emp2Teams.size();
        return emp2Teams;
    }

    public Emp2Team getSelectedEmp2Team() {
        return selectedEmp2Team;
    }

    public void setSelectedEmp2Team(Emp2Team selectedEmp2Team) {
        this.selectedEmp2Team = selectedEmp2Team;
    }

    public void onRowSelect(SelectEvent event) throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("emp2teamDetail.xhtml");
        setEditible(true);
    }

    public void init() throws IOException {
        setSelectedEmp2Team(null);
        setEditible(false);
    }

    public boolean isEditible() {
        return editible;
    }

    public void setEditible(boolean editible) {
        this.editible = editible;
    }

    public String doAction(String action) {
        Action act = Action.fromString(action);
        switch (act)
            {
            case DELETE:
                System.out.println("Penny coin");
                break;
            case CREATE:
                setSelectedEmp2Team(new Emp2Team());
                break;
            case SAVE:
                getEmp2TeamManager().saveEmp2Team(getSelectedEmp2Team());
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
