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

    public void saveLessonType(LessonType lessonType) {
        getLessonTypeDao().saveLessonType(lessonType);
    }

    public List<LessonType> getLessonTypes() {
        return getLessonTypeDao().getLessonTypes();
    }

    public List<LessonType> getLessonTypes(String sortBy, boolean sortOrder) {
        return getLessonTypeDao().getLessonTypes(sortBy, sortOrder);
    }

    public void editLessonType(LessonType lessonType) {
        getLessonTypeDao().editLessonType(lessonType);
    }

    public LessonType getLessonType(Long id) {
        return getLessonTypeDao().getLessonType(id);
    }

}
