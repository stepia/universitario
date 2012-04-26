package dao;

import java.util.List;

import entry.Lesson;

public interface LessonDao {

    public List<Lesson> getLessons();

    public void createLesson(Lesson lesson);

    public void editLesson(Lesson lesson);

    public Lesson getLesson(Long id);

}
