package service;

import java.util.List;

import entry.Discipline;

public interface IDisciplineManager {

    public List<Discipline> getDisciplines();

    public void createDiscipline(Discipline discipline);

    public void editDiscipline(Discipline discipline);

}
