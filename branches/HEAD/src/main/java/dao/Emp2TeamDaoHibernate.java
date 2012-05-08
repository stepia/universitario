package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import entry.Emp2Team;

public class Emp2TeamDaoHibernate implements Emp2TeamDao {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<Emp2Team> getEmp2Teams() {
        return sessionFactory.getCurrentSession().createCriteria(Emp2Team.class)
                    .list();
    }
    
    @SuppressWarnings("unchecked")
    @Transactional
    public List<Emp2Team> getEmp2Teams(String sortBy, boolean sortOrder) {
        if (sortOrder) {
            return sessionFactory.getCurrentSession().createCriteria(Emp2Team.class).addOrder(Order.asc(sortBy)).list();
        } else {
            return sessionFactory.getCurrentSession().createCriteria(Emp2Team.class).addOrder(Order.desc(sortBy)).list();
        }

    }

    @Transactional
    public void deleteEmp2Team(Emp2Team empTeam) {
        sessionFactory.getCurrentSession().delete(empTeam);

    }

    @Transactional
    public void saveEmp2Team(Emp2Team empTeam) {
        sessionFactory.getCurrentSession().save(empTeam);

    }

    @Transactional
    public void saveOrUpdate(Emp2Team empTeam) {
        sessionFactory.getCurrentSession().saveOrUpdate(empTeam);

    }

    @Transactional
    public void editEmp2Team(Emp2Team empTeam) {
        sessionFactory.getCurrentSession().merge(empTeam);
    }

    @Transactional
    public Emp2Team getEmp2Team(Long id) {
        List empTeams = sessionFactory.getCurrentSession().createCriteria(Emp2Team.class)
                    .add(Restrictions.eq("id", id)).list();
        Emp2Team empTeam = null;
        if ((empTeams != null) && (empTeams.size() > 0)) {
            empTeam = (Emp2Team) empTeams.get(0);
        }
        return empTeam;
    }
}