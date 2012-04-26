package service;

import java.util.List;

import entry.Lesson;

public interface ILessonManager {

    public List<Lesson> getLessons();

    public void createLesson(Lesson lesson);

    public void editLesson(Lesson lesson);

}
