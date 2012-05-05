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

import service.IStateManager;
import entry.State;

@ManagedBean
@SessionScoped
public class StateViewBean {

    @ManagedProperty(value = "#{stateManager}")
    private IStateManager stateManager;
    private State selectedState;
    private List<State> states = new ArrayList<State>();
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

    public IStateManager getStateManager() {
        return stateManager;
    }

    public void setStateManager(IStateManager stateManager) {
        this.stateManager = stateManager;
    }

    public List<State> getStates() {
        if (sortBy == null) {
            states = getStateManager().getStates();
        } else {
            states = getStateManager().getStates(sortBy, sortOrder);
        }
        this.length = states.size();
        return states;
    }

    public State getSelectedState() {
        return selectedState;
    }

    public void setSelectedState(State selectedState) {
        this.selectedState = selectedState;
    }

    public String doAction(String action) throws UnsupportedEncodingException {
        Action act = Action.fromString(action);
        switch (act)
            {
            case DELETE:
                getStateManager().deleteState(getSelectedState());
                break;
            case CREATE:
                setSelectedState(new State());
                break;
            case SAVE:
                if (getSelectedState().getCreated() != null) {
                    getStateManager().saveOrUpdate(getSelectedState());
                } else {
                    getStateManager().saveState(getSelectedState());
                }
                break;
            }
        return action;
    }

    public void onRowSelect(SelectEvent event) throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("stateDetail.xhtml");
        setEditible(true);
    }

    public void init() throws IOException {
        setSelectedState(null);
        setEditible(false);
    }

    public boolean isEditible() {
        return editible;
    }

    public void setEditible(boolean editible) {
        this.editible = editible;
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
