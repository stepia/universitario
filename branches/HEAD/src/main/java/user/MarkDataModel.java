package user;

import java.util.List;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

import entry.Mark;

public class MarkDataModel extends ListDataModel<Mark> implements SelectableDataModel<Mark> {

    public MarkDataModel() {
    }

    public MarkDataModel(List<Mark> data) {
        super(data);
    }

    public Mark getRowData(String rowKey) {

        @SuppressWarnings("unchecked")
        List<Mark> marks = (List<Mark>) getWrappedData();

        for (Mark mark : marks) {
            if (mark.getName().equals(rowKey))
                return mark;
        }

        return null;
    }

    public String getRowKey(Mark mark) {
        return mark.getName();
    }
}
