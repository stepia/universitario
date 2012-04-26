package user;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import service.IMarkManager;
import entry.Mark;

@ManagedBean
@RequestScoped
public class MarkViewBean {

    private Mark mark;
    @ManagedProperty(value = "#{markManager}")
    private IMarkManager markManager;
    private Mark selectedMark;
    private Mark[] selectedMarks;
    private List<Mark> marks = new ArrayList<Mark>();

    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Mark[] getSelectedMarks() {
        return selectedMarks;
    }

    public void setSelectedMarks(Mark[] selectedMarks) {
        this.selectedMarks = selectedMarks;
    }

    public IMarkManager getMarkManager() {
        return markManager;
    }

    public void setMarkManager(IMarkManager markManager) {
        this.markManager = markManager;
    }

    public List<Mark> getMarks() {
    	marks = markManager.getMarks();
        this.length = marks.size();
        return marks;
    }

    public Mark getSelectedMark() {
        return selectedMark;
    }

    public void setSelectedMark(Mark selectedMark) {
        this.selectedMark = selectedMark;
    }

    public Mark getMark() {
        return mark;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }

}
