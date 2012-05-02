package user;

import java.util.List;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

import entry.Position;

public class PositionDataModel extends ListDataModel<Position> implements SelectableDataModel<Position> {

    public PositionDataModel() {
    }

    public PositionDataModel(List<Position> data) {
        super(data);
    }

    public Position getRowData(String rowKey) {
    	Long id = Long.valueOf(rowKey);

        @SuppressWarnings("unchecked")
        List<Position> positions = (List<Position>) getWrappedData();

        for (Position position : positions) {
            if (position.getId().equals(id))
                return position;
        }

        return null;
    }

    public Long getRowKey(Position position) {
        return position.getId();
    }
}
