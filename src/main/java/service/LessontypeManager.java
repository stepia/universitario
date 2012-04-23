package service;

import java.util.List;

import dao.LessontypeDao;
import entry.Lessontype;

public class LessontypeManager implements ILessontypeManager {

    private LessontypeDao lessontypeDao;

    public LessontypeDao getLessontypeDao() {
        return lessontypeDao;
    }

    public void setLessontypeDao(LessontypeDao lessontypeDao) {
        this.lessontypeDao = lessontypeDao;
    }

    public void createLessontype(Lessontype lessontype) {
        getLessontypeDao().createLessontype(lessontype);
    }

    public List<Lessontype> getLessontypes() {
        return getLessontypeDao().getLessontypes();
    }

    public void editLessontype(Lessontype lessontype) {
        getLessontypeDao().editLessontype(lessontype);
    }

    public Lessontype getLessontype(String name) {
        return getLessontypeDao().getLessontype(name);
    }

}
