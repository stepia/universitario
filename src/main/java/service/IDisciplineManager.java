package service;

import java.util.List;

import entry.Discipline;

public interface IDisciplineManager {

    public List<Discipline> getDisciplines();

    public void saveDiscipline(Discipline discipline);

    public void editDiscipline(Discipline discipline);
    
    public List<Discipline> getDisciplines(String sortBy, boolean sortOrder);

}
