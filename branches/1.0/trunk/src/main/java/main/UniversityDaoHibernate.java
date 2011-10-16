package main;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class UniversityDaoHibernate extends HibernateDaoSupport implements
		UniversityDao {

	@SuppressWarnings("unchecked")
	public List<Decane> getDecanes() {
		return getHibernateTemplate().find("from Decane");
	}

}
