package dao;

import java.util.List;

import entry.Discipline;

public interface DisciplineDao {

    public List<Discipline> getDisciplines();

    public List<Discipline> getDisciplines(String sortBy, boolean sortOrder);

    public void saveDiscipline(Discipline discipline);

    public void editDiscipline(Discipline discipline);

    public Discipline getDiscipline(Long id);

}
