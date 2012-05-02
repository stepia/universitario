package service;

import java.util.List;

import dao.StateDao;
import entry.State;

public class StateManager implements IStateManager {

    private StateDao stateDao;

    public StateDao getStateDao() {
        return stateDao;
    }

    public void setStateDao(StateDao stateDao) {
        this.stateDao = stateDao;
    }

    public void createState(State state) {
        getStateDao().createState(state);
    }

    public List<State> getStates() {
        return getStateDao().getStates();
    }

    public void editState(State state) {
        getStateDao().editState(state);
    }

    public State getState(Long id) {
        return getStateDao().getState(id);
    }

}
