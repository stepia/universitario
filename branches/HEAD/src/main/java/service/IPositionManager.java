package service;

import java.util.List;

import entry.Position;

public interface IPositionManager {

    public List<Position> getPositions();

    public void createPosition(Position position);

    public void editPosition(Position position);

}
