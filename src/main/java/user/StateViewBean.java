package user;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import org.primefaces.event.SelectEvent;

import service.IStateManager;
import entry.State;

@ManagedBean
@RequestScoped
public class StateViewBean {

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

    public String doAction(String action) {
        return action;
    }

    public void onRowSelect(SelectEvent event) throws IOException {

        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext()
                    .getRequest();
        request.setAttribute("selectedState", getSelectedState());
        FacesContext.getCurrentInstance().getExternalContext().redirect("stateDetail.xhtml");
    }
}
