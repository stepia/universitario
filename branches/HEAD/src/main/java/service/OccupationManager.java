package service;

import java.util.List;

import dao.OccupationDao;
import entry.Occupation;

public class OccupationManager implements IOccupationManager {

    private OccupationDao occupationDao;

    public OccupationDao getOccupationDao() {
        return occupationDao;
    }

    public void setOccupationDao(OccupationDao occupationDao) {
        this.occupationDao = occupationDao;
    }

    public void createOccupation(Occupation occupation) {
        getOccupationDao().createOccupation(occupation);
    }

    public List<Occupation> getOccupations() {
        return getOccupationDao().getOccupations();
    }

    public void editOccupation(Occupation occupation) {
        getOccupationDao().editOccupation(occupation);
    }

    public Occupation getOccupation(Long id) {
        return getOccupationDao().getOccupation(id);
    }

}
