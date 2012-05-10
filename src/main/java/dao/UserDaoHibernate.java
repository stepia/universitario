package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import entry.User;

public class UserDaoHibernate implements UserDao {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<User> getUsers() {
        return sessionFactory.getCurrentSession().createCriteria(User.class)
                    .list();
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<User> getUsers(String sortBy, boolean sortOrder) {
        if (sortOrder) {
            return sessionFactory.getCurrentSession().createCriteria(User.class).addOrder(Order.asc(sortBy)).list();
        } else {
            return sessionFactory.getCurrentSession().createCriteria(User.class).addOrder(Order.desc(sortBy)).list();
        }

    }

    @Transactional
    public void deleteUser(User user) {
        sessionFactory.getCurrentSession().delete(user);

    }

    @Transactional
    public void saveUser(User user) {
        sessionFactory.getCurrentSession().save(user);

    }

    @Transactional
    public void saveOrUpdate(User user) {
        sessionFactory.getCurrentSession().saveOrUpdate(user);

    }

    @Transactional
    public void editUser(User user) {
        sessionFactory.getCurrentSession().merge(user);
    }

    @Transactional
    public User getUser(String username) {
        List users = sessionFactory.getCurrentSession().createCriteria(User.class)
                    .add(Restrictions.eq("username", username)).list();
        User user = null;
        if ((users != null) && (users.size() > 0)) {
            user = (User) users.get(0);
        }
        return user;
    }

}
