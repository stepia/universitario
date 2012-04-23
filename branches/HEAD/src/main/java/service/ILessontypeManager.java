package service;

import java.util.List;

import entry.Lessontype;

public interface ILessontypeManager {

    public List<Lessontype> getLessontypes();

    public void createLessontype(Lessontype lessontype);

    public void editLessontype(Lessontype lessontype);

}
