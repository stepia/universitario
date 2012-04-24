package user;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import service.IDisciplineManager;
import entry.Discipline;

@ManagedBean
@RequestScoped
public class DisciplineViewBean {

    private Discipline discipline;
    @ManagedProperty(value = "#{disciplineManager}")
    private IDisciplineManager disciplineManager;
    private Discipline selectedDiscipline;
    private Discipline[] selectedDisciplines;
    private List<Discipline> disciplines = new ArrayList<Discipline>();

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

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }

}
