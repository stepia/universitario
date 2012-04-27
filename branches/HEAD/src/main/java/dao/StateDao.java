package dao;

import java.util.List;

import entry.State;

public interface StateDao {

    public List<State> getStates();

    public void createState(State state);

    public void editState(State state);

    public State getState(String name);

}