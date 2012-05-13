package service;

import java.util.List;

import dao.DisciplineDao;
import entry.Discipline;

public class DisciplineManager implements DisciplineDao {

    private DisciplineDao disciplineDao;

    public DisciplineDao getDisciplineDao() {
        return disciplineDao;
    }

    public void setDisciplineDao(DisciplineDao disciplineDao) {
        this.disciplineDao = disciplineDao;
    }

    public void saveDiscipline(Discipline discipline) {
        getDisciplineDao().saveDiscipline(discipline);
    }

    public void saveOrUpdate(Discipline discipline) {
        getDisciplineDao().saveOrUpdate(discipline);
    }

    public void deleteDiscipline(Discipline discipline) {
        getDisciplineDao().deleteDiscipline(discipline);
    }

    public List<Discipline> getDisciplines() {
        return getDisciplineDao().getDisciplines();
    }

    public List<Discipline> getDisciplines(String sortBy, boolean sortOrder) {
        return getDisciplineDao().getDisciplines(sortBy, sortOrder);
    }

    public void editDiscipline(Discipline discipline) {
        getDisciplineDao().editDiscipline(discipline);
    }

    public Discipline getDiscipline(Long id) {
        return getDisciplineDao().getDiscipline(id);
    }

}
