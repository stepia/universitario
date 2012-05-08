package service;

import java.util.List;

import entry.Lesson;

public interface ILessonManager {

    public List<Lesson> getLessons();

    public void saveLesson(Lesson lesson);

    public void editLesson(Lesson lesson);

    public List<Lesson> getLessons(String sortBy, boolean sortOrder);

    public void deleteLesson(Lesson lesson);

    public void saveOrUpdate(Lesson lesson);

}
