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

import dao.PositionDao;
import entry.Position;

@ManagedBean
@SessionScoped
public class PositionViewBean {

    @ManagedProperty(value = "#{positionManager}")
    private PositionDao positionManager;
    private Position selectedPosition;
    private List<Position> positions = new ArrayList<Position>();
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

    public PositionDao getPositionManager() {
        return positionManager;
    }

    public void setPositionManager(PositionDao positionManager) {
        this.positionManager = positionManager;
    }

    public List<Position> getPositions() {
        if (sortBy == null) {
            positions = getPositionManager().getPositions();
        } else {
            positions = getPositionManager().getPositions(sortBy, sortOrder);
        }
        this.length = positions.size();
        return positions;
    }

    public Position getSelectedPosition() {
        return selectedPosition;
    }

    public void setSelectedPosition(Position selectedPosition) {
        this.selectedPosition = selectedPosition;
    }

    public void onRowSelect(SelectEvent event) throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("positionDetail.xhtml");
        setEditible(true);
    }

    public void init() throws IOException {
        setSelectedPosition(null);
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
                getPositionManager().deletePosition(getSelectedPosition());
                break;
            case CREATE:
                setSelectedPosition(new Position());
                break;
            case SAVE:
                if (getSelectedPosition().getCreated() != null) {
                    getPositionManager().saveOrUpdate(getSelectedPosition());
                } else {
                    getPositionManager().savePosition(getSelectedPosition());
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
