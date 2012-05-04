package service;

import java.util.List;

import entry.Occupation;

public interface IOccupationManager {

    public List<Occupation> getOccupations();

    public void saveOccupation(Occupation occupation);

    public void editOccupation(Occupation occupation);

    public List<Occupation> getOccupations(String sortBy, boolean sortOrder);

}
