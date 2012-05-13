package user;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;
import org.primefaces.event.data.SortEvent;

import dao.MarkDao;
import entry.Mark;

@ManagedBean
@SessionScoped
public class MarkViewBean {

    @ManagedProperty(value = "#{markManager}")
    private MarkDao markManager;
    private Mark selectedMark;
    private List<Mark> marks = new ArrayList<Mark>();
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

    public MarkDao getMarkManager() {
        return markManager;
    }

    public void setMarkManager(MarkDao markManager) {
        this.markManager = markManager;
    }

    public List<Mark> getMarks() {
        if (sortBy == null) {
            marks = getMarkManager().getMarks();
        } else {
            marks = getMarkManager().getMarks(sortBy, sortOrder);
        }
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

    public String doAction(String action) throws UnsupportedEncodingException {
        Action act = Action.fromString(action);
        switch (act)
            {
            case DELETE:
                getMarkManager().deleteMark(getSelectedMark());
                break;
            case CREATE:
                setSelectedMark(new Mark());
                break;
            case SAVE:
                if (getSelectedMark().getCreated() != null) {
                    getMarkManager().saveOrUpdate(getSelectedMark());
                } else {
                    getMarkManager().saveMark(getSelectedMark());
                }
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
