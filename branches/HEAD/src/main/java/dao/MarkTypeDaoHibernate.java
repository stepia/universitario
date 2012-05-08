package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import entry.MarkType;

public class MarkTypeDaoHibernate implements MarkTypeDao {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<MarkType> getMarkTypes() {
        return sessionFactory.getCurrentSession().createCriteria(MarkType.class)
                    .list();
    }
    
    @SuppressWarnings("unchecked")
    @Transactional
    public List<MarkType> getMarkTypes(String sortBy, boolean sortOrder) {
        if (sortOrder) {
            return sessionFactory.getCurrentSession().createCriteria(MarkType.class).addOrder(Order.asc(sortBy)).list();
        } else {
            return sessionFactory.getCurrentSession().createCriteria(MarkType.class).addOrder(Order.desc(sortBy)).list();
        }

    }

    @Transactional
    public void deleteMarkType(MarkType marktype) {
        sessionFactory.getCurrentSession().delete(marktype);

    }

    @Transactional
    public void saveMarkType(MarkType marktype) {
        sessionFactory.getCurrentSession().save(marktype);

    }

    @Transactional
    public void saveOrUpdate(MarkType marktype) {
        sessionFactory.getCurrentSession().saveOrUpdate(marktype);

    }

    @Transactional
    public void editMarkType(MarkType marktype) {
        sessionFactory.getCurrentSession().merge(marktype);
    }

    @Transactional
    public MarkType getMarkType(String name) {
        List marktypes = sessionFactory.getCurrentSession().createCriteria(MarkType.class)
                    .add(Restrictions.eq("name", name)).list();
        MarkType marktype = null;
        if ((marktypes != null) && (marktypes.size() > 0)) {
        	marktype = (MarkType) marktypes.get(0);
        }
        return marktype;
    }
}