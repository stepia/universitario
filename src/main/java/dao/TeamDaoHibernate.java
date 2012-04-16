package dao;

import java.util.List;

import org.hibernate.SessionFactory;
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

    @Transactional
    public void createTeam(Team team) {
        sessionFactory.getCurrentSession().save(team);

    }

    @Transactional
    public void editTeam(Team team) {
        sessionFactory.getCurrentSession().merge(team);
    }

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
