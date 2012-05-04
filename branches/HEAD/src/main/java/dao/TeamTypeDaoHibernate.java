package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import entry.TeamType;

public class TeamTypeDaoHibernate implements TeamTypeDao {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<TeamType> getTeamTypes() {
        return sessionFactory.getCurrentSession().createCriteria(TeamType.class)
                    .list();
    }
    
    @SuppressWarnings("unchecked")
    @Transactional
    public List<TeamType> getTeamTypes(String sortBy, boolean sortOrder) {
        if (sortOrder) {
            return sessionFactory.getCurrentSession().createCriteria(TeamType.class).addOrder(Order.asc(sortBy)).list();
        } else {
            return sessionFactory.getCurrentSession().createCriteria(TeamType.class).addOrder(Order.desc(sortBy)).list();
        }

    }

    @Transactional
    public void saveTeamType(TeamType teamType) {
        sessionFactory.getCurrentSession().saveOrUpdate(teamType);

    }

    @Transactional
    public void editTeamType(TeamType teamType) {
        sessionFactory.getCurrentSession().merge(teamType);
    }

    @Transactional
    public TeamType getTeamType(Long id) {
        List teamTypes = sessionFactory.getCurrentSession().createCriteria(TeamType.class)
                    .add(Restrictions.eq("id", id)).list();
        TeamType teamType = null;
        if ((teamTypes != null) && (teamTypes.size() > 0)) {
        	teamType = (TeamType) teamTypes.get(0);
        }
        return teamType;
    }
}