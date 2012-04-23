package dao;

import java.util.List;

import org.hibernate.SessionFactory;
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

    @Transactional
    public void createRole(Role role) {
        sessionFactory.getCurrentSession().save(role);

    }

    @Transactional
    public void editRole(Role role) {
        sessionFactory.getCurrentSession().merge(role);
    }

    @Transactional
    public Role getRole(String name) {
        List roles = sessionFactory.getCurrentSession().createCriteria(Role.class)
                    .add(Restrictions.eq("name", name)).list();
        Role role = null;
        if ((roles != null) && (roles.size() > 0)) {
        	role = (Role) roles.get(0);
        }
        return role;
    }
}