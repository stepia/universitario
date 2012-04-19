package service;

import java.util.List;

import entry.Person;

public interface IPersonManager {

    public List<Person> getPersons();

    public void createPerson(Person person);

    public void editPerson(Person person);

}
