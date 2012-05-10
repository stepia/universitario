package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import entry.Authority;

public class AuthorityDaoHibernate implements AuthorityDao {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<Authority> getAuthorities() {
        return sessionFactory.getCurrentSession().createCriteria(Authority.class)
                    .list();
    }
    
    @SuppressWarnings("unchecked")
    @Transactional
    public List<Authority> getAuthorities(String sortBy, boolean sortOrder) {
        if (sortOrder) {
            return sessionFactory.getCurrentSession().createCriteria(Authority.class).addOrder(Order.asc(sortBy)).list();
        } else {
            return sessionFactory.getCurrentSession().createCriteria(Authority.class).addOrder(Order.desc(sortBy)).list();
        }

    }
    
    @Transactional
    public void deleteAuthority(Authority authority) {
        sessionFactory.getCurrentSession().delete(authority);

    }

    @Transactional
    public void saveAuthority(Authority authority) {
        sessionFactory.getCurrentSession().save(authority);

    }

    @Transactional
    public void saveOrUpdate(Authority authority) {
        sessionFactory.getCurrentSession().saveOrUpdate(authority);

    }

    @Transactional
    public void editAuthority(Authority authority) {
        sessionFactory.getCurrentSession().merge(authority);
    }

    @Transactional
    public Authority getAuthority(Long id) {
        List authorities = sessionFactory.getCurrentSession().createCriteria(Authority.class)
                    .add(Restrictions.eq("id", id)).list();
        Authority authority = null;
        if ((authorities != null) && (authorities.size() > 0)) {
        	authority = (Authority) authorities.get(0);
        }
        return authority;
    }
}
