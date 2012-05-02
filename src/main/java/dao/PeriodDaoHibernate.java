package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import entry.Period;

public class PeriodDaoHibernate implements PeriodDao {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<Period> getPeriods() {
        return sessionFactory.getCurrentSession().createCriteria(Period.class)
                    .list();
    }

    @Transactional
    public void createPeriod(Period period) {
        sessionFactory.getCurrentSession().save(period);

    }

    @Transactional
    public void editPeriod(Period period) {
        sessionFactory.getCurrentSession().merge(period);
    }

    @Transactional
    public Period getPeriod(Long id) {
        List periods = sessionFactory.getCurrentSession().createCriteria(Period.class)
                    .add(Restrictions.eq("id", id)).list();
        Period period = null;
        if ((periods != null) && (periods.size() > 0)) {
        	period = (Period) periods.get(0);
        }
        return period;
    }
}