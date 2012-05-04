package service;

import java.util.List;

import entry.Position;

public interface IPositionManager {

    public List<Position> getPositions();

    public void savePosition(Position position);

    public void editPosition(Position position);

    public List<Position> getPositions(String sortBy, boolean sortOrder);

}
