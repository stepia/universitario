package user;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import service.ILessonManager;
import entry.Lesson;

@ManagedBean
@RequestScoped
public class LessonViewBean {

    private Lesson lesson;
    @ManagedProperty(value = "#{lessonManager}")
    private ILessonManager lessonManager;
    private Lesson selectedLesson;
    private Lesson[] selectedLessons;
    private List<Lesson> lessons = new ArrayList<Lesson>();

    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Lesson[] getSelectedLessons() {
        return selectedLessons;
    }

    public void setSelectedLessons(Lesson[] selectedLessons) {
        this.selectedLessons = selectedLessons;
    }

    public ILessonManager getLessonManager() {
        return lessonManager;
    }

    public void setLessonManager(ILessonManager lessonManager) {
        this.lessonManager = lessonManager;
    }

    public List<Lesson> getLessons() {
    	lessons = lessonManager.getLessons();
        this.length = lessons.size();
        return lessons;
    }

    public Lesson getSelectedLesson() {
        return selectedLesson;
    }

    public void setSelectedLesson(Lesson selectedLesson) {
        this.selectedLesson = selectedLesson;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

}
