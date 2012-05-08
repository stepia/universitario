package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
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
    
    @SuppressWarnings("unchecked")
    @Transactional
    public List<Person> getPersons(String sortBy, boolean sortOrder) {
        if (sortOrder) {
            return sessionFactory.getCurrentSession().createCriteria(Person.class).addOrder(Order.asc(sortBy)).list();
        } else {
            return sessionFactory.getCurrentSession().createCriteria(Person.class).addOrder(Order.desc(sortBy)).list();
        }

    }

    @Transactional
    public void deletePerson(Person person) {
        sessionFactory.getCurrentSession().delete(person);

    }

    @Transactional
    public void savePerson(Person person) {
        sessionFactory.getCurrentSession().save(person);

    }

    @Transactional
    public void saveOrUpdate(Person person) {
        sessionFactory.getCurrentSession().saveOrUpdate(person);

    }

    @Transactional
    public void editPerson(Person person) {
        sessionFactory.getCurrentSession().merge(person);
    }

    @Transactional
    public Person getPerson(Long id) {
        List persons = sessionFactory.getCurrentSession().createCriteria(Person.class)
                    .add(Restrictions.eq("id", id)).list();
        Person person = null;
        if ((persons != null) && (persons.size() > 0)) {
            person = (Person) persons.get(0);
        }
        return person;
    }
}