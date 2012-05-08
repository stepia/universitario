package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import entry.Lesson;

public class LessonDaoHibernate implements LessonDao {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<Lesson> getLessons() {
        return sessionFactory.getCurrentSession().createCriteria(Lesson.class)
                    .list();
    }
    
    @SuppressWarnings("unchecked")
    @Transactional
    public List<Lesson> getLessons(String sortBy, boolean sortOrder) {
        if (sortOrder) {
            return sessionFactory.getCurrentSession().createCriteria(Lesson.class).addOrder(Order.asc(sortBy)).list();
        } else {
            return sessionFactory.getCurrentSession().createCriteria(Lesson.class).addOrder(Order.desc(sortBy)).list();
        }

    }

    @Transactional
    public void deleteLesson(Lesson lesson) {
        sessionFactory.getCurrentSession().delete(lesson);

    }

    @Transactional
    public void saveLesson(Lesson lesson) {
        sessionFactory.getCurrentSession().save(lesson);

    }

    @Transactional
    public void saveOrUpdate(Lesson lesson) {
        sessionFactory.getCurrentSession().saveOrUpdate(lesson);

    }

    @Transactional
    public void editLesson(Lesson lesson) {
        sessionFactory.getCurrentSession().merge(lesson);
    }

    @Transactional
    public Lesson getLesson(Long id) {
        List lessons = sessionFactory.getCurrentSession().createCriteria(Lesson.class)
                    .add(Restrictions.eq("id", id)).list();
        Lesson lesson = null;
        if ((lessons != null) && (lessons.size() > 0)) {
        	lesson = (Lesson) lessons.get(0);
        }
        return lesson;
    }
}