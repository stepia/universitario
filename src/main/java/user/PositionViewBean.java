package user;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import service.IPositionManager;
import entry.Position;

@ManagedBean
@RequestScoped
public class PositionViewBean {

    private Position position;
    @ManagedProperty(value = "#{positionManager}")
    private IPositionManager positionManager;
    private Position selectedPosition;
    private Position[] selectedPositions;
    private List<Position> positions = new ArrayList<Position>();

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

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

}
