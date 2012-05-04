package user;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;

import service.IDisciplineManager;
import entry.Discipline;

@ManagedBean
@SessionScoped
public class DisciplineViewBean {

    @ManagedProperty(value = "#{disciplineManager}")
    private IDisciplineManager disciplineManager;
    private Discipline selectedDiscipline;
    private Discipline[] selectedDisciplines;
    private List<Discipline> disciplines = new ArrayList<Discipline>();
    private boolean editible;

    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Discipline[] getSelectedDisciplines() {
        return selectedDisciplines;
    }

    public void setSelectedDisciplines(Discipline[] selectedDisciplines) {
        this.selectedDisciplines = selectedDisciplines;
    }

    public IDisciplineManager getDisciplineManager() {
        return disciplineManager;
    }

    public void setDisciplineManager(IDisciplineManager disciplineManager) {
        this.disciplineManager = disciplineManager;
    }

    public List<Discipline> getDisciplines() {
    	disciplines = disciplineManager.getDisciplines();
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

    public String doAction(String action) {
        return action;
    }

}
