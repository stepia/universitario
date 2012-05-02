package service;

import java.util.List;

import dao.LessonTypeDao;
import entry.LessonType;

public class LessonTypeManager implements ILessonTypeManager {

    private LessonTypeDao lessonTypeDao;

    public LessonTypeDao getLessonTypeDao() {
        return lessonTypeDao;
    }

    public void setLessonTypeDao(LessonTypeDao lessonTypeDao) {
        this.lessonTypeDao = lessonTypeDao;
    }

    public void createLessonType(LessonType lessonType) {
        getLessonTypeDao().createLessonType(lessonType);
    }

    public List<LessonType> getLessonTypes() {
        return getLessonTypeDao().getLessonTypes();
    }

    public void editLessonType(LessonType lessonType) {
        getLessonTypeDao().editLessonType(lessonType);
    }

    public LessonType getLessonType(Long id) {
        return getLessonTypeDao().getLessonType(id);
    }

}
