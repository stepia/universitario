package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import entry.UserIPerson;

public class UserIPersonDaoHibernate implements UserIPersonDao {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<UserIPerson> getUserIPersons() {
        return sessionFactory.getCurrentSession().createCriteria(UserIPerson.class)
                    .list();
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<UserIPerson> getUserIPersons(String sortBy, boolean sortOrder) {
        if (sortOrder) {
            return sessionFactory.getCurrentSession().createCriteria(UserIPerson.class).addOrder(Order.asc(sortBy))
                        .list();
        } else {
            return sessionFactory.getCurrentSession().createCriteria(UserIPerson.class).addOrder(Order.desc(sortBy))
                        .list();
        }

    }

    @Transactional
    public void deleteUserIPerson(UserIPerson userIPerson) {
        sessionFactory.getCurrentSession().delete(userIPerson);

    }

    @Transactional
    public void saveUserIPerson(UserIPerson userIPerson) {
        sessionFactory.getCurrentSession().save(userIPerson);

    }

    @Transactional
    public void saveOrUpdate(UserIPerson userIPerson) {
        sessionFactory.getCurrentSession().saveOrUpdate(userIPerson);

    }

    @Transactional
    public void editUserIPerson(UserIPerson userIPerson) {
        sessionFactory.getCurrentSession().merge(userIPerson);
    }

    @SuppressWarnings("rawtypes")
    @Transactional
    public UserIPerson getUserIPerson(Long id) {
        List userIPersons = sessionFactory.getCurrentSession().createCriteria(UserIPerson.class)
                    .add(Restrictions.eq("id", id)).list();
        UserIPerson userIPerson = null;
        if ((userIPersons != null) && (userIPersons.size() > 0)) {
            userIPerson = (UserIPerson) userIPersons.get(0);
        }
        return userIPerson;
    }

}