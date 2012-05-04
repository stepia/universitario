package user;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;

import service.ILessonManager;
import entry.Lesson;

@ManagedBean
@SessionScoped
public class LessonViewBean {

    @ManagedProperty(value = "#{lessonManager}")
    private ILessonManager lessonManager;
    private Lesson selectedLesson;
    private Lesson[] selectedLessons;
    private List<Lesson> lessons = new ArrayList<Lesson>();
    private boolean editible;

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

    public void onRowSelect(SelectEvent event) throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("lessonDetail.xhtml");
        setEditible(true);
    }

    public void init() throws IOException {
        setSelectedLesson(null);
        setEditible(false);
    }

    public boolean isEditible() {
        return editible;
    }

    public void setEditible(boolean editible) {
        this.editible = editible;
    }

    public String doAction(String action) {
        return action;
    }

}
