package user;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;

import service.IPositionManager;
import entry.Position;

@ManagedBean
@SessionScoped
public class PositionViewBean {

    @ManagedProperty(value = "#{positionManager}")
    private IPositionManager positionManager;
    private Position selectedPosition;
    private Position[] selectedPositions;
    private List<Position> positions = new ArrayList<Position>();
    private boolean editible;

    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Position[] getSelectedPositions() {
        return selectedPositions;
    }

    public void setSelectedPositions(Position[] selectedPositions) {
        this.selectedPositions = selectedPositions;
    }

    public IPositionManager getPositionManager() {
        return positionManager;
    }

    public void setPositionManager(IPositionManager positionManager) {
        this.positionManager = positionManager;
    }

    public List<Position> getPositions() {
    	positions = positionManager.getPositions();
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

    public String doAction(String action) {
        return action;
    }

}
