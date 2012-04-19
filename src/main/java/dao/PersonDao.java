package dao;

import java.util.List;

import entry.Person;

public interface PersonDao {

    public List<Person> getPersons();

    public void createPerson(Person person);

    public void editPerson(Person person);

    public Person getPerson(String firstName);

}
