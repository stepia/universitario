package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import entry.Position;

public class PositionDaoHibernate implements PositionDao {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<Position> getPositions() {
        return sessionFactory.getCurrentSession().createCriteria(Position.class)
                    .list();
    }

    @Transactional
    public void createPosition(Position position) {
        sessionFactory.getCurrentSession().save(position);

    }

    @Transactional
    public void editPosition(Position position) {
        sessionFactory.getCurrentSession().merge(position);
    }

    @Transactional
    public Position getPosition(String name) {
        List positions = sessionFactory.getCurrentSession().createCriteria(Position.class)
                    .add(Restrictions.eq("name", name)).list();
        Position position = null;
        if ((positions != null) && (positions.size() > 0)) {
        	position = (Position) positions.get(0);
        }
        return position;
    }
}