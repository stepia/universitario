package service;

import java.util.List;

import dao.PersonDao;
import entry.Person;

public class PersonManager implements IPersonManager {

    private PersonDao personDao;

    public PersonDao getPersonDao() {
        return personDao;
    }

    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }

    public void createPerson(Person person) {
        getPersonDao().createPerson(person);
    }

    public List<Person> getPersons() {
        return getPersonDao().getPersons();
    }

    public void editPerson(Person person) {
        getPersonDao().editPerson(person);
    }

    public Person getPerson(String firstname) {
        return getPersonDao().getPerson(firstname);
    }

}
