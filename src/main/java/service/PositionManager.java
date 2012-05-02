package service;

import java.util.List;

import dao.PositionDao;
import entry.Position;

public class PositionManager implements IPositionManager {

    private PositionDao positionDao;

    public PositionDao getPositionDao() {
        return positionDao;
    }

    public void setPositionDao(PositionDao positionDao) {
        this.positionDao = positionDao;
    }

    public void createPosition(Position position) {
        getPositionDao().createPosition(position);
    }

    public List<Position> getPositions() {
        return getPositionDao().getPositions();
    }

    public void editPosition(Position position) {
        getPositionDao().editPosition(position);
    }

    public Position getPosition(Long id) {
        return getPositionDao().getPosition(id);
    }

}
