package user;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import service.ILessontypeManager;
import entry.Lessontype;

@ManagedBean
@RequestScoped
public class LessontypeViewBean {

    private Lessontype lessontype;
    @ManagedProperty(value = "#{lessontypeManager}")
    private ILessontypeManager lessontypeManager;
    private Lessontype selectedLessontype;
    private Lessontype[] selectedLessontypes;
    private List<Lessontype> lessontypes = new ArrayList<Lessontype>();

    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Lessontype[] getSelectedLessontypes() {
        return selectedLessontypes;
    }

    public void setSelectedLessontypes(Lessontype[] selectedLessontypes) {
        this.selectedLessontypes = selectedLessontypes;
    }

    public ILessontypeManager getLessontypeManager() {
        return lessontypeManager;
    }

    public void setLessontypeManager(ILessontypeManager lessontypeManager) {
        this.lessontypeManager = lessontypeManager;
    }

    public List<Lessontype> getLessontypes() {
    	lessontypes = lessontypeManager.getLessontypes();
        this.length = lessontypes.size();
        return lessontypes;
    }

    public Lessontype getSelectedLessontype() {
        return selectedLessontype;
    }

    public void setSelectedLessontype(Lessontype selectedLessontype) {
        this.selectedLessontype = selectedLessontype;
    }

    public Lessontype getLessontype() {
        return lessontype;
    }

    public void setLessontype(Lessontype lessontype) {
        this.lessontype = lessontype;
    }

}
