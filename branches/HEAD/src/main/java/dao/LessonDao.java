package dao;

import java.util.List;

import entry.Lesson;

public interface LessonDao {

    public List<Lesson> getLessons();

    public List<Lesson> getLessons(String sortBy, boolean sortOrder);

    public void saveLesson(Lesson lesson);

    public void editLesson(Lesson lesson);

    public Lesson getLesson(Long id);

    public void deleteLesson(Lesson lesson);

    public void saveOrUpdate(Lesson lesson);

}
