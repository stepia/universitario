package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import entry.EmpTeam;

public class EmpTeamDaoHibernate implements EmpTeamDao {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<EmpTeam> getEmpTeams() {
        return sessionFactory.getCurrentSession().createCriteria(EmpTeam.class)
                    .list();
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<EmpTeam> getEmpTeams(String sortBy, boolean sortOrder) {
        if (sortOrder) {
            return sessionFactory.getCurrentSession().createCriteria(EmpTeam.class)
                        .addOrder(Order.asc(sortBy))
                        .list();
        } else {
            return sessionFactory.getCurrentSession().createCriteria(EmpTeam.class)
                        .addOrder(Order.desc(sortBy))
                        .list();
        }

    }

    @Transactional
    public void deleteEmpTeam(EmpTeam empTeam) {
        sessionFactory.getCurrentSession().delete(empTeam);

    }

    @Transactional
    public void saveEmpTeam(EmpTeam empTeam) {
        sessionFactory.getCurrentSession().save(empTeam);

    }

    @Transactional
    public void saveOrUpdate(EmpTeam empTeam) {
        sessionFactory.getCurrentSession().saveOrUpdate(empTeam);

    }

    @Transactional
    public void editEmpTeam(EmpTeam empTeam) {
        sessionFactory.getCurrentSession().merge(empTeam);
    }

    @SuppressWarnings("rawtypes")
    @Transactional
    public EmpTeam getEmpTeam(Long id) {
        List empTeams = sessionFactory.getCurrentSession().createCriteria(EmpTeam.class)
                    .add(Restrictions.eq("id", id)).list();
        EmpTeam empTeam = null;
        if ((empTeams != null) && (empTeams.size() > 0)) {
            empTeam = (EmpTeam) empTeams.get(0);
        }
        return empTeam;
    }
}