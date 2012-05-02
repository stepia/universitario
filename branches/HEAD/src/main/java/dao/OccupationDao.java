package dao;

import java.util.List;

import entry.Occupation;

public interface OccupationDao {

    public List<Occupation> getOccupations();

    public void createOccupation(Occupation occupation);

    public void editOccupation(Occupation occupation);

    public Occupation getOccupation(Long id);

}
