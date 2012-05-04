package dao;

import java.util.List;

import entry.LessonType;

public interface LessonTypeDao {

    public List<LessonType> getLessonTypes();

    public List<LessonType> getLessonTypes(String sortBy, boolean sortOrder);

    public void saveLessonType(LessonType lessonType);

    public void editLessonType(LessonType lessonType);

    public LessonType getLessonType(Long id);

}
