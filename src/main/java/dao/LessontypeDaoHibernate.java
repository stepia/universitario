package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import entry.Lessontype;

public class LessontypeDaoHibernate implements LessontypeDao {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<Lessontype> getLessontypes() {
        return sessionFactory.getCurrentSession().createCriteria(Lessontype.class)
                    .list();
    }

    @Transactional
    public void createLessontype(Lessontype lessontype) {
        sessionFactory.getCurrentSession().save(lessontype);

    }

    @Transactional
    public void editLessontype(Lessontype lessontype) {
        sessionFactory.getCurrentSession().merge(lessontype);
    }

    @Transactional
    public Lessontype getLessontype(String name) {
        List lessontypes = sessionFactory.getCurrentSession().createCriteria(Lessontype.class)
                    .add(Restrictions.eq("name", name)).list();
        Lessontype lessontype = null;
        if ((lessontypes != null) && (lessontypes.size() > 0)) {
        	lessontype = (Lessontype) lessontypes.get(0);
        }
        return lessontype;
    }
}