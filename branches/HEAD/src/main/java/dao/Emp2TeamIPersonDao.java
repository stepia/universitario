package dao;

import java.util.List;

import entry.Emp2TeamIPerson;

public interface Emp2TeamIPersonDao {

    public List<Emp2TeamIPerson> getEmp2TeamIPersons();

    public List<Emp2TeamIPerson> getEmp2TeamIPersons(String sortBy, boolean sortOrder);

    public void saveEmp2TeamIPerson(Emp2TeamIPerson empTeam);

    public void editEmp2TeamIPerson(Emp2TeamIPerson empTeam);

    public Emp2TeamIPerson getEmp2TeamIPerson(Long id);

    public void deleteEmp2TeamIPerson(Emp2TeamIPerson empTeam);

    public void saveOrUpdate(Emp2TeamIPerson empTeam);

}
