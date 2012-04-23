package service;

import java.util.List;

import entry.Occupation;

public interface IOccupationManager {

    public List<Occupation> getOccupations();

    public void createOccupation(Occupation occupation);

    public void editOccupation(Occupation occupation);

}
