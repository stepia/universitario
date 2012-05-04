package user;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;

import service.ILessonTypeManager;
import entry.LessonType;

@ManagedBean
@SessionScoped
public class LessonTypeViewBean {

    @ManagedProperty(value = "#{lessonTypeManager}")
    private ILessonTypeManager lessonTypeManager;
    private LessonType selectedLessonType;
    private LessonType[] selectedLessonTypes;
    private List<LessonType> lessonTypes = new ArrayList<LessonType>();
    private boolean editible;

    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public LessonType[] getSelectedLessonTypes() {
        return selectedLessonTypes;
    }

    public void setSelectedLessonTypes(LessonType[] selectedLessonTypes) {
        this.selectedLessonTypes = selectedLessonTypes;
    }

    public ILessonTypeManager getLessonTypeManager() {
        return lessonTypeManager;
    }

    public void setLessonTypeManager(ILessonTypeManager lessonTypeManager) {
        this.lessonTypeManager = lessonTypeManager;
    }

    public List<LessonType> getLessonTypes() {
    	lessonTypes = lessonTypeManager.getLessonTypes();
        this.length = lessonTypes.size();
        return lessonTypes;
    }

    public LessonType getSelectedLessonType() {
        return selectedLessonType;
    }

    public void setSelectedLessonType(LessonType selectedLessonType) {
        this.selectedLessonType = selectedLessonType;
    }

    public void onRowSelect(SelectEvent event) throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("lessontypeDetail.xhtml");
        setEditible(true);
    }

    public void init() throws IOException {
        setSelectedLessonType(null);
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
