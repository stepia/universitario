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

    public void createLesson(Lesson lesson) {
        getLessonDao().createLesson(lesson);
    }

    public List<Lesson> getLessons() {
        return getLessonDao().getLessons();
    }

    public void editLesson(Lesson lesson) {
        getLessonDao().editLesson(lesson);
    }

    public Lesson getLesson(Long id) {
        return getLessonDao().getLesson(id);
    }

}
