package dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import entry.Authority;

public class AuthorityDaoHibernate extends HibernateDaoSupport implements AuthorityDao {

    @SuppressWarnings("unchecked")
    public List<Authority> getAuthorities() {
        return getHibernateTemplate().find("from Authorities");
    }

    public void createAuthority(Authority role) {
        getHibernateTemplate().save(role);

    }

    public void deleteAuthority(Authority role) {
        getHibernateTemplate().delete(role);
        getHibernateTemplate().flush();

    }

}
