package dao;

import java.util.List;

import entry.Occupation;

public interface OccupationDao {

    public List<Occupation> getOccupations();

    public List<Occupation> getOccupations(String sortBy, boolean sortOrder);

    public void saveOccupation(Occupation occupation);

    public void editOccupation(Occupation occupation);

    public Occupation getOccupation(Long id);

    public void deleteOccupation(Occupation occupation);

    public void saveOrUpdate(Occupation occupation);

}
