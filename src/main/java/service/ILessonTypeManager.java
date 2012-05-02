package service;

import java.util.List;

import entry.LessonType;

public interface ILessonTypeManager {

    public List<LessonType> getLessonTypes();

    public void createLessonType(LessonType lessonType);

    public void editLessonType(LessonType lessonType);

}
