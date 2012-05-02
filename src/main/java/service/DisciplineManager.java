package service;

import java.util.List;

import dao.DisciplineDao;
import entry.Discipline;

public class DisciplineManager implements IDisciplineManager {

    private DisciplineDao disciplineDao;

    public DisciplineDao getDisciplineDao() {
        return disciplineDao;
    }

    public void setDisciplineDao(DisciplineDao disciplineDao) {
        this.disciplineDao = disciplineDao;
    }

    public void createDiscipline(Discipline discipline) {
        getDisciplineDao().createDiscipline(discipline);
    }

    public List<Discipline> getDisciplines() {
        return getDisciplineDao().getDisciplines();
    }

    public void editDiscipline(Discipline discipline) {
        getDisciplineDao().editDiscipline(discipline);
    }

    public Discipline getDiscipline(Long id) {
        return getDisciplineDao().getDiscipline(id);
    }

}
