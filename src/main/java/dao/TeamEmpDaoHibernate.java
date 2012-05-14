package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import entry.TeamEmp;

public class TeamEmpDaoHibernate implements TeamEmpDao {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<TeamEmp> getTeamEmps() {
        return sessionFactory.getCurrentSession().createCriteria(TeamEmp.class)
                    .list();
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<TeamEmp> getTeamEmps(String sortBy, boolean sortOrder) {
        if (sortOrder) {
            return sessionFactory.getCurrentSession().createCriteria(TeamEmp.class)
                        .addOrder(Order.asc(sortBy))
                        .list();
        } else {
            return sessionFactory.getCurrentSession().createCriteria(TeamEmp.class)
                        .addOrder(Order.desc(sortBy))
                        .list();
        }

    }

    @Transactional
    public void deleteTeamEmp(TeamEmp empTeam) {
        sessionFactory.getCurrentSession().delete(empTeam);

    }

    @Transactional
    public void saveTeamEmp(TeamEmp empTeam) {
        sessionFactory.getCurrentSession().save(empTeam);

    }

    @Transactional
    public void saveOrUpdate(TeamEmp empTeam) {
        sessionFactory.getCurrentSession().saveOrUpdate(empTeam);

    }

    @Transactional
    public void editTeamEmp(TeamEmp empTeam) {
        sessionFactory.getCurrentSession().merge(empTeam);
    }

    @SuppressWarnings("rawtypes")
    @Transactional
    public TeamEmp getTeamEmp(Long id) {
        List empTeams = sessionFactory.getCurrentSession().createCriteria(TeamEmp.class)
                    .add(Restrictions.eq("id", id)).list();
        TeamEmp empTeam = null;
        if ((empTeams != null) && (empTeams.size() > 0)) {
            empTeam = (TeamEmp) empTeams.get(0);
        }
        return empTeam;
    }
}