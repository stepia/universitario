package dao;

import java.util.List;

import entry.Position;

public interface PositionDao {

    public List<Position> getPositions();

    public void createPosition(Position position);

    public void editPosition(Position position);

    public Position getPosition(String name);

}
