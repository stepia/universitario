package dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import entry.User;


public class UserDaoHibernate extends HibernateDaoSupport implements UserDao {

    @SuppressWarnings("unchecked")
    public List<User> getUsers() {
        return getHibernateTemplate().find("from Users");
    }

    public void createUser(User user) {
        getHibernateTemplate().save(user);

    }

    public void deleteUser(User user) {
        getHibernateTemplate().delete(user);
        getHibernateTemplate().flush();

    }
}
