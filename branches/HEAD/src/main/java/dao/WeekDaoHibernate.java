package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import entry.Week;

public class WeekDaoHibernate implements WeekDao {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<Week> getWeeks() {
        return sessionFactory.getCurrentSession().createCriteria(Week.class)
                    .list();
    }
    
    @SuppressWarnings("unchecked")
    @Transactional
    public List<Week> getWeeks(String sortBy, boolean sortOrder) {
        if (sortOrder) {
            return sessionFactory.getCurrentSession().createCriteria(Week.class).addOrder(Order.asc(sortBy)).list();
        } else {
            return sessionFactory.getCurrentSession().createCriteria(Week.class).addOrder(Order.desc(sortBy)).list();
        }

    }

    @Transactional
    public void deleteWeek(Week week) {
        sessionFactory.getCurrentSession().delete(week);

    }

    @Transactional
    public void saveWeek(Week week) {
        sessionFactory.getCurrentSession().save(week);

    }

    @Transactional
    public void saveOrUpdate(Week week) {
        sessionFactory.getCurrentSession().saveOrUpdate(week);

    }

    @Transactional
    public void editWeek(Week week) {
        sessionFactory.getCurrentSession().merge(week);
    }

    @Transactional
    public Week getWeek(Long id) {
        List weeks = sessionFactory.getCurrentSession().createCriteria(Week.class)
                    .add(Restrictions.eq("id", id)).list();
        Week week = null;
        if ((weeks != null) && (weeks.size() > 0)) {
        	week = (Week) weeks.get(0);
        }
        return week;
    }
}