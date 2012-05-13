package service;

import java.util.List;

import dao.OccupationDao;
import entry.Occupation;

public class OccupationManager implements OccupationDao {

    private OccupationDao occupationDao;

    public OccupationDao getOccupationDao() {
        return occupationDao;
    }

    public void setOccupationDao(OccupationDao occupationDao) {
        this.occupationDao = occupationDao;
    }

    public void saveOccupation(Occupation occupation) {
        getOccupationDao().saveOccupation(occupation);
    }

    public void saveOrUpdate(Occupation occupation) {
        getOccupationDao().saveOrUpdate(occupation);
    }

    public void deleteOccupation(Occupation occupation) {
        getOccupationDao().deleteOccupation(occupation);
    }

    public List<Occupation> getOccupations() {
        return getOccupationDao().getOccupations();
    }

    public List<Occupation> getOccupations(String sortBy, boolean sortOrder) {
        return getOccupationDao().getOccupations(sortBy, sortOrder);
    }

    public void editOccupation(Occupation occupation) {
        getOccupationDao().editOccupation(occupation);
    }

    public Occupation getOccupation(Long id) {
        return getOccupationDao().getOccupation(id);
    }

}
