package user;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import service.IStateManager;
import entry.State;

@ManagedBean
@RequestScoped
public class StateViewBean {

    private State state;
    @ManagedProperty(value = "#{stateManager}")
    private IStateManager stateManager;
    private State selectedState;
    private State[] selectedStates;
    private List<State> states = new ArrayList<State>();

    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public State[] getSelectedStates() {
        return selectedStates;
    }

    public void setSelectedStates(State[] selectedStates) {
        this.selectedStates = selectedStates;
    }

    public IStateManager getStateManager() {
        return stateManager;
    }

    public void setStateManager(IStateManager stateManager) {
        this.stateManager = stateManager;
    }

    public List<State> getStates() {
    	states = stateManager.getStates();
        this.length = states.size();
        return states;
    }

    public State getSelectedState() {
        return selectedState;
    }

    public void setSelectedState(State selectedState) {
        this.selectedState = selectedState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

}
