package dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import entry.Authority;
import entry.Person;
import entry.User;

public class UserDaoHibernate implements UserDao {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<User> getUsers() {
		return sessionFactory.getCurrentSession().createCriteria(User.class)
				.list();
	}

	@Transactional
	public void createUser(User user) {
		Set<Authority> authorities = new HashSet<Authority>();
		Authority authority = new Authority();
		authority.setAuthority("ROLE_USER");
		authorities.add(authority);

		authority.setUsername(user.getUsername());
		user.setAuthorities(authorities);

		user.setPerson(new Person());

		sessionFactory.getCurrentSession().save(user);

	}

	@Transactional
	public void editUser(User user) {
		sessionFactory.getCurrentSession().saveOrUpdate(user);
	}

}
