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

import service.IMarkTypeManager;
import entry.MarkType;

@ManagedBean
@SessionScoped
public class MarkTypeViewBean {

    @ManagedProperty(value = "#{markTypeManager}")
    private IMarkTypeManager markTypeManager;
    private MarkType selectedMarkType;
    private List<MarkType> markTypes = new ArrayList<MarkType>();
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

    public IMarkTypeManager getMarkTypeManager() {
        return markTypeManager;
    }

    public void setMarkTypeManager(IMarkTypeManager markTypeManager) {
        this.markTypeManager = markTypeManager;
    }

    public List<MarkType> getMarkTypes() {
    	if (sortBy == null) {
    		markTypes = getMarkTypeManager().getMarkTypes();
        } else {
        	markTypes = getMarkTypeManager().getMarkTypes(sortBy, sortOrder);
        }
        this.length = markTypes.size();
        return markTypes;
    }

    public MarkType getSelectedMarkType() {
        return selectedMarkType;
    }

    public void setSelectedMarkType(MarkType selectedMarkType) {
        this.selectedMarkType = selectedMarkType;
    }

    public void onRowSelect(SelectEvent event) throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("marktypeDetail.xhtml");
        setEditible(true);
    }

    public void init() throws IOException {
        setSelectedMarkType(null);
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
                setSelectedMarkType(new MarkType());
                break;
            case SAVE:
                getMarkTypeManager().saveMarkType(getSelectedMarkType());
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
