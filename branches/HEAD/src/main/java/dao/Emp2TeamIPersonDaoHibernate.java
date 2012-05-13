package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import entry.Emp2TeamIPerson;

public class Emp2TeamIPersonDaoHibernate implements Emp2TeamIPersonDao {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<Emp2TeamIPerson> getEmp2TeamIPersons() {
        return sessionFactory.getCurrentSession().createCriteria(Emp2TeamIPerson.class)
                    .list();
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<Emp2TeamIPerson> getEmp2TeamIPersons(String sortBy, boolean sortOrder) {
        if (sortOrder) {
            return sessionFactory.getCurrentSession().createCriteria(Emp2TeamIPerson.class)
                        .addOrder(Order.asc(sortBy))
                        .list();
        } else {
            return sessionFactory.getCurrentSession().createCriteria(Emp2TeamIPerson.class)
                        .addOrder(Order.desc(sortBy))
                        .list();
        }

    }

    @Transactional
    public void deleteEmp2TeamIPerson(Emp2TeamIPerson empTeam) {
        sessionFactory.getCurrentSession().delete(empTeam);

    }

    @Transactional
    public void saveEmp2TeamIPerson(Emp2TeamIPerson empTeam) {
        sessionFactory.getCurrentSession().save(empTeam);

    }

    @Transactional
    public void saveOrUpdate(Emp2TeamIPerson empTeam) {
        sessionFactory.getCurrentSession().saveOrUpdate(empTeam);

    }

    @Transactional
    public void editEmp2TeamIPerson(Emp2TeamIPerson empTeam) {
        sessionFactory.getCurrentSession().merge(empTeam);
    }

    @SuppressWarnings("rawtypes")
    @Transactional
    public Emp2TeamIPerson getEmp2TeamIPerson(Long id) {
        List empTeams = sessionFactory.getCurrentSession().createCriteria(Emp2TeamIPerson.class)
                    .add(Restrictions.eq("id", id)).list();
        Emp2TeamIPerson empTeam = null;
        if ((empTeams != null) && (empTeams.size() > 0)) {
            empTeam = (Emp2TeamIPerson) empTeams.get(0);
        }
        return empTeam;
    }
}