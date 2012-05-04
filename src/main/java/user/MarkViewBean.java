package user;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;

import service.IMarkManager;
import entry.Mark;

@ManagedBean
@SessionScoped
public class MarkViewBean {

    @ManagedProperty(value = "#{markManager}")
    private IMarkManager markManager;
    private Mark selectedMark;
    private Mark[] selectedMarks;
    private List<Mark> marks = new ArrayList<Mark>();
    private boolean editible;

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

    public void onRowSelect(SelectEvent event) throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("markDetail.xhtml");
        setEditible(true);
    }

    public void init() throws IOException {
        setSelectedMark(null);
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
