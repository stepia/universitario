package service;

import java.util.List;

import entry.LessonType;

public interface ILessonTypeManager {

    public List<LessonType> getLessonTypes();

    public void saveLessonType(LessonType lessonType);

    public void editLessonType(LessonType lessonType);

    public List<LessonType> getLessonTypes(String sortBy, boolean sortOrder);

}
