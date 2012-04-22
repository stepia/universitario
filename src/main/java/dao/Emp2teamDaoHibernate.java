package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import entry.Emp2team;

public class Emp2teamDaoHibernate implements Emp2teamDao {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<Emp2team> getEmp2teams() {
        return sessionFactory.getCurrentSession().createCriteria(Emp2team.class)
                    .list();
    }

    @Transactional
    public void createEmp2team(Emp2team emp2team) {
        sessionFactory.getCurrentSession().save(emp2team);

    }

    @Transactional
    public void editEmp2team(Emp2team emp2team) {
        sessionFactory.getCurrentSession().merge(emp2team);
    }

    @Transactional
    public Emp2team getEmp2team(Long id) {
        List emp2teams = sessionFactory.getCurrentSession().createCriteria(Emp2team.class)
                    .add(Restrictions.eq("id", id)).list();
        Emp2team emp2team = null;
        if ((emp2teams != null) && (emp2teams.size() > 0)) {
        	emp2team = (Emp2team) emp2teams.get(0);
        }
        return emp2team;
    }
}