package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import entry.Time;

public class TimeDaoHibernate implements TimeDao {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<Time> getTimes() {
        return sessionFactory.getCurrentSession().createCriteria(Time.class)
                    .list();
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<Time> getTimes(String sortBy, boolean sortOrder) {
        if (sortOrder) {
            return sessionFactory.getCurrentSession().createCriteria(Time.class).addOrder(Order.asc(sortBy)).list();
        } else {
            return sessionFactory.getCurrentSession().createCriteria(Time.class).addOrder(Order.desc(sortBy)).list();
        }

    }

    @Transactional
    public void deleteTime(Time time) {
        sessionFactory.getCurrentSession().delete(time);

    }

    @Transactional
    public void saveTime(Time time) {
        sessionFactory.getCurrentSession().save(time);

    }

    @Transactional
    public void saveOrUpdate(Time time) {
        sessionFactory.getCurrentSession().saveOrUpdate(time);

    }

    @Transactional
    public void editTime(Time time) {
        sessionFactory.getCurrentSession().merge(time);
    }

    @SuppressWarnings("rawtypes")
    @Transactional
    public Time getTime(Long id) {
        List times = sessionFactory.getCurrentSession().createCriteria(Time.class)
                    .add(Restrictions.eq("id", id)).list();
        Time time = null;
        if ((times != null) && (times.size() > 0)) {
            time = (Time) times.get(0);
        }
        return time;
    }
}