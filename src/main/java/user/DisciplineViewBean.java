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

import service.IDisciplineManager;
import entry.Discipline;

@ManagedBean
@SessionScoped
public class DisciplineViewBean {

    @ManagedProperty(value = "#{disciplineManager}")
    private IDisciplineManager disciplineManager;
    private Discipline selectedDiscipline;
    private List<Discipline> disciplines = new ArrayList<Discipline>();
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

    public IDisciplineManager getDisciplineManager() {
        return disciplineManager;
    }

    public void setDisciplineManager(IDisciplineManager disciplineManager) {
        this.disciplineManager = disciplineManager;
    }

    public List<Discipline> getDisciplines() {
    	if (sortBy == null) {
    		disciplines = getDisciplineManager().getDisciplines();
        } else {
        	disciplines = getDisciplineManager().getDisciplines(sortBy, sortOrder);
        }
        this.length = disciplines.size();
        return disciplines;
    }

    public Discipline getSelectedDiscipline() {
        return selectedDiscipline;
    }

    public void setSelectedDiscipline(Discipline selectedDiscipline) {
        this.selectedDiscipline = selectedDiscipline;
    }
    
    public void onRowSelect(SelectEvent event) throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("disciplineDetail.xhtml");
        setEditible(true);
    }

    public void init() throws IOException {
        setSelectedDiscipline(null);
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
            	getDisciplineManager().deleteDiscipline(getSelectedDiscipline());
                break;
            case CREATE:
                setSelectedDiscipline(new Discipline());
                break;
            case SAVE:
            	if (getSelectedDiscipline().getCreated() != null) {
                    getDisciplineManager().saveOrUpdate(getSelectedDiscipline());
                } else {
                    getDisciplineManager().saveDiscipline(getSelectedDiscipline());
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
