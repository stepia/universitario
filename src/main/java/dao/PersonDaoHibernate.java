package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import entry.Person;

public class PersonDaoHibernate implements PersonDao {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<Person> getPersons() {
        return sessionFactory.getCurrentSession().createCriteria(Person.class)
                    .list();
    }

    @Transactional
    public void createPerson(Person person) {
        sessionFactory.getCurrentSession().save(person);

    }

    @Transactional
    public void editPerson(Person person) {
        sessionFactory.getCurrentSession().merge(person);
    }

    @Transactional
    public Person getPerson(String firstname) {
        List persons = sessionFactory.getCurrentSession().createCriteria(Person.class)
                    .add(Restrictions.eq("firstname", firstname)).list();
        Person person = null;
        if ((persons != null) && (persons.size() > 0)) {
            person = (Person) persons.get(0);
        }
        return person;
    }
}