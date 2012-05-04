package user;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;
import org.primefaces.event.data.SortEvent;

import service.ILessonManager;
import entry.Lesson;

@ManagedBean
@SessionScoped
public class LessonViewBean {

    @ManagedProperty(value = "#{lessonManager}")
    private ILessonManager lessonManager;
    private Lesson selectedLesson;
    private List<Lesson> lessons = new ArrayList<Lesson>();
    private boolean editible;
    private boolean sortOrder;
    private String sortBy;

    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public ILessonManager getLessonManager() {
        return lessonManager;
    }

    public void setLessonManager(ILessonManager lessonManager) {
        this.lessonManager = lessonManager;
    }

    public List<Lesson> getLessons() {
    	if (sortBy == null) {
    		lessons = getLessonManager().getLessons();
        } else {
        	lessons = getLessonManager().getLessons(sortBy, sortOrder);
        }
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
        Action act = Action.fromString(action);
        switch (act)
            {
            case DELETE:
                System.out.println("Penny coin");
                break;
            case CREATE:
                setSelectedLesson(new Lesson());
                break;
            case SAVE:
                getLessonManager().saveLesson(getSelectedLesson());
                break;

            }
        return action;
    }
    
    public void caseListSortListner(SortEvent sortEvent) {
        setSortBy(sortEvent.getSortColumn().getId());
        if (sortEvent.isAscending()) {
            setSortOrder(true);
        } else {
            setSortOrder(false);
        }
    }

    public boolean isSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(boolean sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

}
