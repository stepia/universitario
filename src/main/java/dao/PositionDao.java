package dao;

import java.util.List;

import entry.Position;

public interface PositionDao {

    public List<Position> getPositions();

    public List<Position> getPositions(String sortBy, boolean sortOrder);

    public void savePosition(Position position);

    public void editPosition(Position position);

    public Position getPosition(Long id);

}
