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

import service.ILessonTypeManager;
import entry.LessonType;

@ManagedBean
@SessionScoped
public class LessonTypeViewBean {

    @ManagedProperty(value = "#{lessonTypeManager}")
    private ILessonTypeManager lessonTypeManager;
    private LessonType selectedLessonType;
    private List<LessonType> lessonTypes = new ArrayList<LessonType>();
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

    public ILessonTypeManager getLessonTypeManager() {
        return lessonTypeManager;
    }

    public void setLessonTypeManager(ILessonTypeManager lessonTypeManager) {
        this.lessonTypeManager = lessonTypeManager;
    }

    public List<LessonType> getLessonTypes() {
    	if (sortBy == null) {
    		lessonTypes = getLessonTypeManager().getLessonTypes();
        } else {
        	lessonTypes = getLessonTypeManager().getLessonTypes(sortBy, sortOrder);
        }
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
        Action act = Action.fromString(action);
        switch (act)
            {
            case DELETE:
                System.out.println("Penny coin");
                break;
            case CREATE:
                setSelectedLessonType(new LessonType());
                break;
            case SAVE:
                getLessonTypeManager().saveLessonType(getSelectedLessonType());
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
