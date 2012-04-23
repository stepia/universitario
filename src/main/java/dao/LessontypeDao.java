package dao;

import java.util.List;

import entry.Lessontype;

public interface LessontypeDao {

    public List<Lessontype> getLessontypes();

    public void createLessontype(Lessontype lessontype);

    public void editLessontype(Lessontype lessontype);

    public Lessontype getLessontype(String name);

}
