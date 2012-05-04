package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import entry.Role;

public class RoleDaoHibernate implements RoleDao {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<Role> getRoles() {
        return sessionFactory.getCurrentSession().createCriteria(Role.class)
                    .list();
    }
    
    @SuppressWarnings("unchecked")
    @Transactional
    public List<Role> getRoles(String sortBy, boolean sortOrder) {
        if (sortOrder) {
            return sessionFactory.getCurrentSession().createCriteria(Role.class).addOrder(Order.asc(sortBy)).list();
        } else {
            return sessionFactory.getCurrentSession().createCriteria(Role.class).addOrder(Order.desc(sortBy)).list();
        }

    }

    @Transactional
    public void saveRole(Role role) {
        sessionFactory.getCurrentSession().saveOrUpdate(role);

    }

    @Transactional
    public void editRole(Role role) {
        sessionFactory.getCurrentSession().merge(role);
    }

    @Transactional
    public Role getRole(Long id) {
        List roles = sessionFactory.getCurrentSession().createCriteria(Role.class)
                    .add(Restrictions.eq("id", id)).list();
        Role role = null;
        if ((roles != null) && (roles.size() > 0)) {
        	role = (Role) roles.get(0);
        }
        return role;
    }
}