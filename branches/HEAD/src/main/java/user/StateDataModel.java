package user;

import java.util.List;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

import entry.State;

public class StateDataModel extends ListDataModel<State> implements SelectableDataModel<State> {

    public StateDataModel() {
    }

    public StateDataModel(List<State> data) {
        super(data);
    }

    public State getRowData(String rowKey) {

        @SuppressWarnings("unchecked")
        List<State> states = (List<State>) getWrappedData();

        for (State state : states) {
            if (state.getName().equals(rowKey))
                return state;
        }

        return null;
    }

    public String getRowKey(State state) {
        return state.getName();
    }
}
