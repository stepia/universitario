package dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.dao.support.DataAccessUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import entry.Authority;
import entry.Employee;
import entry.Person;
import entry.User;

public class UserDaoHibernate extends HibernateDaoSupport implements UserDao {

	@SuppressWarnings("unchecked")
	public User getUserById(long id) {
		return (User) DataAccessUtils.uniqueResult(getHibernateTemplate().find(
				"from User where id=?", new Object[] { id }));
	}

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

		user.setPerson(new Person());
		user.setEmployee(new Employee());
		getHibernateTemplate().save(user);

	}

	public void deleteUser(User user) {
		getHibernateTemplate().delete(user);
		getHibernateTemplate().flush();
	}

	public void editUser(User user) {
		try {
			getHibernateTemplate().update(user);
		} catch (Exception e) {
			System.out.println("some shit:" + e);
		}

	}

}
