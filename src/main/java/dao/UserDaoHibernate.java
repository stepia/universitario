package dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
				"from User where usaa=?", new Object[] { id }));
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
		getHibernateTemplate().save(user);

		Person person = new Person();
		person.setId(user.getUsaa());
		getHibernateTemplate().save(person);

	}

	public void deleteUser(User user) {
		getHibernateTemplate().delete(user);
		getHibernateTemplate().flush();
	}

	public int editUser(User user, Person person) {
		Query personQuery;
		Query userQuery;
		try {
			SessionFactory sf = getHibernateTemplate().getSessionFactory();
			Session s = sf.openSession();
			userQuery = s
					.createQuery("update User set username=:username where usaa=:usaa");
			userQuery.setString("username", user.getUsername());
			userQuery.setLong("usaa", user.getUsaa());

			personQuery = s
					.createQuery("update Person set firstname=:firstname, lastname=:lastname ,middlename=:middlename ,dob=:dob");
			personQuery.setString("firstname", person.getFirstName());
			personQuery.setString("lastname", person.getLastName());
			personQuery.setString("middlename", person.getMiddleName());
			personQuery.setDate("dob", person.getDob());
		} catch (Exception e) {
			System.out.println("some shit:" + e);
			return 0;
		}

		return userQuery.executeUpdate() + personQuery.executeUpdate();
	}

}
