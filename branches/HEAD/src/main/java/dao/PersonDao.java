package dao;

import java.util.List;

import entry.Person;

public interface PersonDao {

    public List<Person> getPersons();

    public List<Person> getPersons(String sortBy, boolean sortOrder);

    public void savePerson(Person person);

    public void editPerson(Person person);

    public Person getPerson(Long id);

    public void deletePerson(Person person);

    public void saveOrUpdate(Person person);

}
