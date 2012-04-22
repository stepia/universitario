package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import entry.Teamtype;

public class TeamtypeDaoHibernate implements TeamtypeDao {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<Teamtype> getTeamtypes() {
        return sessionFactory.getCurrentSession().createCriteria(Teamtype.class)
                    .list();
    }

    @Transactional
    public void createTeamtype(Teamtype teamtype) {
        sessionFactory.getCurrentSession().save(teamtype);

    }

    @Transactional
    public void editTeamtype(Teamtype teamtype) {
        sessionFactory.getCurrentSession().merge(teamtype);
    }

    @Transactional
    public Teamtype getTeamtype(Long id) {
        List teamtypes = sessionFactory.getCurrentSession().createCriteria(Teamtype.class)
                    .add(Restrictions.eq("id", id)).list();
        Teamtype teamtype = null;
        if ((teamtypes != null) && (teamtypes.size() > 0)) {
        	teamtype = (Teamtype) teamtypes.get(0);
        }
        return teamtype;
    }
}