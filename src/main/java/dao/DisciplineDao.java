package dao;

import java.util.List;

import entry.Discipline;

public interface DisciplineDao {

    public List<Discipline> getDisciplines();

    public void createDiscipline(Discipline discipline);

    public void editDiscipline(Discipline discipline);

    public Discipline getDiscipline(String name);

}
