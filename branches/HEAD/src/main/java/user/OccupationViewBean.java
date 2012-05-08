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

import service.IOccupationManager;
import entry.Occupation;

@ManagedBean
@SessionScoped
public class OccupationViewBean {

    @ManagedProperty(value = "#{occupationManager}")
    private IOccupationManager occupationManager;
    private Occupation selectedOccupation;
    private List<Occupation> occupations = new ArrayList<Occupation>();
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

    public IOccupationManager getOccupationManager() {
        return occupationManager;
    }

    public void setOccupationManager(IOccupationManager occupationManager) {
        this.occupationManager = occupationManager;
    }

    public List<Occupation> getOccupations() {
    	if (sortBy == null) {
    		occupations = getOccupationManager().getOccupations();
        } else {
        	occupations = getOccupationManager().getOccupations(sortBy, sortOrder);
        }
        this.length = occupations.size();
        return occupations;
    }

    public Occupation getSelectedOccupation() {
        return selectedOccupation;
    }

    public void setSelectedOccupation(Occupation selectedOccupation) {
        this.selectedOccupation = selectedOccupation;
    }

    public void onRowSelect(SelectEvent event) throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("occupationDetail.xhtml");
        setEditible(true);
    }

    public void init() throws IOException {
        setSelectedOccupation(null);
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
            	getOccupationManager().deleteOccupation(getSelectedOccupation());
                break;
            case CREATE:
                setSelectedOccupation(new Occupation());
                break;
            case SAVE:
            	if (getSelectedOccupation().getCreated() != null) {
                    getOccupationManager().saveOrUpdate(getSelectedOccupation());
                } else {
                    getOccupationManager().saveOccupation(getSelectedOccupation());
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
