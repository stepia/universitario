package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import entry.Emp2TeamITeam;

public class Emp2TeamITeamDaoHibernate implements Emp2TeamITeamDao {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<Emp2TeamITeam> getEmp2TeamITeams() {
        return sessionFactory.getCurrentSession().createCriteria(Emp2TeamITeam.class)
                    .list();
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<Emp2TeamITeam> getEmp2TeamITeams(String sortBy, boolean sortOrder) {
        if (sortOrder) {
            return sessionFactory.getCurrentSession().createCriteria(Emp2TeamITeam.class)
                        .addOrder(Order.asc(sortBy))
                        .list();
        } else {
            return sessionFactory.getCurrentSession().createCriteria(Emp2TeamITeam.class)
                        .addOrder(Order.desc(sortBy))
                        .list();
        }

    }

    @Transactional
    public void deleteEmp2TeamITeam(Emp2TeamITeam empTeam) {
        sessionFactory.getCurrentSession().delete(empTeam);

    }

    @Transactional
    public void saveEmp2TeamITeam(Emp2TeamITeam empTeam) {
        sessionFactory.getCurrentSession().save(empTeam);

    }

    @Transactional
    public void saveOrUpdate(Emp2TeamITeam empTeam) {
        sessionFactory.getCurrentSession().saveOrUpdate(empTeam);

    }

    @Transactional
    public void editEmp2TeamITeam(Emp2TeamITeam empTeam) {
        sessionFactory.getCurrentSession().merge(empTeam);
    }

    @SuppressWarnings("rawtypes")
    @Transactional
    public Emp2TeamITeam getEmp2TeamITeam(Long id) {
        List empTeams = sessionFactory.getCurrentSession().createCriteria(Emp2TeamITeam.class)
                    .add(Restrictions.eq("id", id)).list();
        Emp2TeamITeam empTeam = null;
        if ((empTeams != null) && (empTeams.size() > 0)) {
            empTeam = (Emp2TeamITeam) empTeams.get(0);
        }
        return empTeam;
    }
}