package service;

import java.util.List;

import dao.LessonDao;
import entry.Lesson;

public class LessonManager implements ILessonManager {

    private LessonDao lessonDao;

    public LessonDao getLessonDao() {
        return lessonDao;
    }

    public void setLessonDao(LessonDao lessonDao) {
        this.lessonDao = lessonDao;
    }

    public void saveLesson(Lesson lesson) {
        getLessonDao().saveLesson(lesson);
    }

    public void saveOrUpdate(Lesson lesson) {
        getLessonDao().saveOrUpdate(lesson);
    }

    public void deleteLesson(Lesson lesson) {
        getLessonDao().deleteLesson(lesson);
    }

    public List<Lesson> getLessons() {
        return getLessonDao().getLessons();
    }

    public List<Lesson> getLessons(String sortBy, boolean sortOrder) {
        return getLessonDao().getLessons(sortBy, sortOrder);
    }

    public void editLesson(Lesson lesson) {
        getLessonDao().editLesson(lesson);
    }

    public Lesson getLesson(Long id) {
        return getLessonDao().getLesson(id);
    }

}
