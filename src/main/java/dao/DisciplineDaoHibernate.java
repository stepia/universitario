package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import entry.Discipline;

public class DisciplineDaoHibernate implements DisciplineDao {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<Discipline> getDisciplines() {
        return sessionFactory.getCurrentSession().createCriteria(Discipline.class)
                    .list();
    }

    @Transactional
    public void createDiscipline(Discipline discipline) {
        sessionFactory.getCurrentSession().save(discipline);

    }

    @Transactional
    public void editDiscipline(Discipline discipline) {
        sessionFactory.getCurrentSession().merge(discipline);
    }

    @Transactional
    public Discipline getDiscipline(Long id) {
        List disciplines = sessionFactory.getCurrentSession().createCriteria(Discipline.class)
                    .add(Restrictions.eq("id", id)).list();
        Discipline discipline = null;
        if ((disciplines != null) && (disciplines.size() > 0)) {
        	discipline = (Discipline) disciplines.get(0);
        }
        return discipline;
    }
}