package service;

import java.util.List;

import entry.Person;

public interface IPersonManager {

    public List<Person> getPersons();

    public void savePerson(Person person);

    public void editPerson(Person person);

    public List<Person> getPersons(String sortBy, boolean sortOrder);

    public void deletePerson(Person person);

    public void saveOrUpdate(Person person);

}
