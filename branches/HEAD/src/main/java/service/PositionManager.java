package service;

import java.util.List;

import dao.PositionDao;
import entry.Position;

public class PositionManager implements PositionDao {

    private PositionDao positionDao;

    public PositionDao getPositionDao() {
        return positionDao;
    }

    public void setPositionDao(PositionDao positionDao) {
        this.positionDao = positionDao;
    }

    public void savePosition(Position position) {
        getPositionDao().savePosition(position);
    }

    public void saveOrUpdate(Position position) {
        getPositionDao().saveOrUpdate(position);
    }

    public void deletePosition(Position position) {
        getPositionDao().deletePosition(position);
    }

    public List<Position> getPositions() {
        return getPositionDao().getPositions();
    }

    public List<Position> getPositions(String sortBy, boolean sortOrder) {
        return getPositionDao().getPositions(sortBy, sortOrder);
    }

    public void editPosition(Position position) {
        getPositionDao().editPosition(position);
    }

    public Position getPosition(Long id) {
        return getPositionDao().getPosition(id);
    }

}
