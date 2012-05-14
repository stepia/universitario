package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import entry.TeamView;

public class TeamViewDaoHibernate implements TeamViewDao {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<TeamView> getTeamViews() {
        return sessionFactory.getCurrentSession().createCriteria(TeamView.class)
                    .list();
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<TeamView> getTeamViews(String sortBy, boolean sortOrder) {
        if (sortOrder) {
            return sessionFactory.getCurrentSession().createCriteria(TeamView.class).addOrder(Order.asc(sortBy))
                        .list();
        } else {
            return sessionFactory.getCurrentSession().createCriteria(TeamView.class).addOrder(Order.desc(sortBy))
                        .list();
        }

    }

    @Transactional
    public void deleteTeamView(TeamView team) {
        sessionFactory.getCurrentSession().delete(team);

    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<TeamView> getParentTeamViews(int teamid) {
        List<TeamView> teams = sessionFactory.getCurrentSession().createSQLQuery(
                    "CALL getParentTeams(:teamid)")
                    .addEntity(TeamView.class)
                    .setParameter("teamid", teamid).list();
        return teams;
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<TeamView> getSubTeamViews(int teamid) {
        List<TeamView> teams = sessionFactory.getCurrentSession().createSQLQuery(
                    "CALL getSubTeams(:teamid)")
                    .addEntity(TeamView.class)
                    .setParameter("teamid", teamid).list();
        return teams;
    }

    @Transactional
    public void saveTeamView(TeamView team) {
        sessionFactory.getCurrentSession().save(team);

    }

    @Transactional
    public void saveOrUpdate(TeamView team) {
        sessionFactory.getCurrentSession().saveOrUpdate(team);

    }

    @Transactional
    public void editTeamView(TeamView team) {
        sessionFactory.getCurrentSession().merge(team);
    }

    @SuppressWarnings("rawtypes")
    @Transactional
    public TeamView getTeamView(String name) {
        List teams = sessionFactory.getCurrentSession().createCriteria(TeamView.class)
                    .add(Restrictions.eq("name", name)).list();
        TeamView team = null;
        if ((teams != null) && (teams.size() > 0)) {
            team = (TeamView) teams.get(0);
        }
        return team;
    }

}