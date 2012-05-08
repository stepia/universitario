package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
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
    
    @SuppressWarnings("unchecked")
    @Transactional
    public List<Position> getPositions(String sortBy, boolean sortOrder) {
        if (sortOrder) {
            return sessionFactory.getCurrentSession().createCriteria(Position.class).addOrder(Order.asc(sortBy)).list();
        } else {
            return sessionFactory.getCurrentSession().createCriteria(Position.class).addOrder(Order.desc(sortBy)).list();
        }

    }

    @Transactional
    public void deletePosition(Position position) {
        sessionFactory.getCurrentSession().delete(position);

    }

    @Transactional
    public void savePosition(Position position) {
        sessionFactory.getCurrentSession().save(position);

    }

    @Transactional
    public void saveOrUpdate(Position position) {
        sessionFactory.getCurrentSession().saveOrUpdate(position);

    }

    @Transactional
    public void editPosition(Position position) {
        sessionFactory.getCurrentSession().merge(position);
    }

    @Transactional
    public Position getPosition(Long id) {
        List positions = sessionFactory.getCurrentSession().createCriteria(Position.class)
                    .add(Restrictions.eq("id", id)).list();
        Position position = null;
        if ((positions != null) && (positions.size() > 0)) {
        	position = (Position) positions.get(0);
        }
        return position;
    }
}