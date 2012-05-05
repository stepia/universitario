package dao;

import java.util.List;

import entry.State;

public interface StateDao {

    public List<State> getStates();

    public List<State> getStates(String sortBy, boolean sortOrder);

    public void saveState(State state);

    public void editState(State state);

    public State getState(Long id);

    public void deleteState(State state);

    public void saveOrUpdate(State state);

}
