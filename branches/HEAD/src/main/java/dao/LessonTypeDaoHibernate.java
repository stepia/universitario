package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import entry.LessonType;

public class LessonTypeDaoHibernate implements LessonTypeDao {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<LessonType> getLessonTypes() {
        return sessionFactory.getCurrentSession().createCriteria(LessonType.class)
                    .list();
    }

    @Transactional
    public void createLessonType(LessonType lessonType) {
        sessionFactory.getCurrentSession().save(lessonType);

    }

    @Transactional
    public void editLessonType(LessonType lessonType) {
        sessionFactory.getCurrentSession().merge(lessonType);
    }

    @Transactional
    public LessonType getLessonType(Long id) {
        List lessonTypes = sessionFactory.getCurrentSession().createCriteria(LessonType.class)
                    .add(Restrictions.eq("id", id)).list();
        LessonType lessonType = null;
        if ((lessonTypes != null) && (lessonTypes.size() > 0)) {
        	lessonType = (LessonType) lessonTypes.get(0);
        }
        return lessonType;
    }
}