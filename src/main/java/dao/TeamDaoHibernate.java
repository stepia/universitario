package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import entry.Team;

public class TeamDaoHibernate implements TeamDao {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<Team> getTeams() {
        return sessionFactory.getCurrentSession().createCriteria(Team.class)
                    .list();
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<Team> getTeams(String sortBy, boolean sortOrder) {
        if (sortOrder) {
            return sessionFactory.getCurrentSession().createCriteria(Team.class).addOrder(Order.asc(sortBy)).list();
        } else {
            return sessionFactory.getCurrentSession().createCriteria(Team.class).addOrder(Order.desc(sortBy)).list();
        }

    }

    @Transactional
    public void deleteTeam(Team team) {
        sessionFactory.getCurrentSession().delete(team);

    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<Team> getParentTeams(int teamid) {
        List<Team> teams = sessionFactory.getCurrentSession().createSQLQuery(
                    "CALL getParentTeams(:teamid)")
                    .addEntity(Team.class)
                    .setParameter("teamid", teamid).list();
        return teams;
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<Team> getSubTeams(int teamid) {
        List<Team> teams = sessionFactory.getCurrentSession().createSQLQuery(
                    "CALL getSubTeams(:teamid)")
                    .addEntity(Team.class)
                    .setParameter("teamid", teamid).list();
        return teams;
    }

    @Transactional
    public void saveTeam(Team team) {
        sessionFactory.getCurrentSession().save(team);

    }

    @Transactional
    public void saveOrUpdate(Team team) {
        sessionFactory.getCurrentSession().saveOrUpdate(team);

    }

    @Transactional
    public void editTeam(Team team) {
        sessionFactory.getCurrentSession().merge(team);
    }

    @SuppressWarnings("rawtypes")
    @Transactional
    public Team getTeam(String name) {
        List teams = sessionFactory.getCurrentSession().createCriteria(Team.class)
                    .add(Restrictions.eq("name", name)).list();
        Team team = null;
        if ((teams != null) && (teams.size() > 0)) {
            team = (Team) teams.get(0);
        }
        return team;
    }
}
