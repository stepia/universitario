package dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import entry.Authority;
import entry.User;

public class UserDaoHibernate extends HibernateDaoSupport implements UserDao {

	@SuppressWarnings("unchecked")
	public List<User> getUsers() {
		return getHibernateTemplate().find("from User");
	}

	public void createUser(User user) {
		Set<Authority> authorities = new HashSet<Authority>();
		Authority authority = new Authority();
		authority.setAuthority("ROLE_USER");
		authorities.add(authority);
		authority.setUsername(user.getUsername());
		user.setAuthorities(authorities);
		getHibernateTemplate().save(user);

	}

	public void deleteUser(User user) {
		getHibernateTemplate().delete(user);
		getHibernateTemplate().flush();
	}

	public int editUser(User user) {
		SessionFactory sf = getHibernateTemplate().getSessionFactory();
		Session s = sf.openSession();
		Query q = s
				.createQuery("update User set username=:username where usaa=:usaa");
		q.setString("username", user.getUsername());
		q.setLong("usaa", user.getUsaa());
		return q.executeUpdate();
	}

}
