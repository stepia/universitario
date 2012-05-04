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

    public void savePerson(Person person) {
        getPersonDao().savePerson(person);
    }

    public List<Person> getPersons() {
        return getPersonDao().getPersons();
    }

    public List<Person> getPersons(String sortBy, boolean sortOrder) {
        return getPersonDao().getPersons(sortBy, sortOrder);
    }

    public void editPerson(Person person) {
        getPersonDao().editPerson(person);
    }

    public Person getPerson(Long id) {
        return getPersonDao().getPerson(id);
    }

}
