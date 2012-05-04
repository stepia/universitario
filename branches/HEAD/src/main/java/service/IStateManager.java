package service;

import java.util.List;

import entry.State;

public interface IStateManager {

    public List<State> getStates();

    public void saveState(State state);

    public void editState(State state);

    public List<State> getStates(String sortBy, boolean sortOrder);

}
