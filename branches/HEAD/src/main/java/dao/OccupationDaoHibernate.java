package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import entry.Occupation;

public class OccupationDaoHibernate implements OccupationDao {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<Occupation> getOccupations() {
        return sessionFactory.getCurrentSession().createCriteria(Occupation.class)
                    .list();
    }

    @Transactional
    public void createOccupation(Occupation occupation) {
        sessionFactory.getCurrentSession().save(occupation);

    }

    @Transactional
    public void editOccupation(Occupation occupation) {
        sessionFactory.getCurrentSession().merge(occupation);
    }

    @Transactional
    public Occupation getOccupation(String name) {
        List occupations = sessionFactory.getCurrentSession().createCriteria(Occupation.class)
                    .add(Restrictions.eq("name", name)).list();
        Occupation occupation = null;
        if ((occupations != null) && (occupations.size() > 0)) {
        	occupation = (Occupation) occupations.get(0);
        }
        return occupation;
    }
}