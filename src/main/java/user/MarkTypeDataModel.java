package user;

import java.util.List;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

import entry.MarkType;

public class MarkTypeDataModel extends ListDataModel<MarkType> implements SelectableDataModel<MarkType> {

    public MarkTypeDataModel() {
    }

    public MarkTypeDataModel(List<MarkType> data) {
        super(data);
    }

    public MarkType getRowData(String rowKey) {
    	String name = String.valueOf(rowKey);

        @SuppressWarnings("unchecked")
        List<MarkType> marktypes = (List<MarkType>) getWrappedData();

        for (MarkType marktype : marktypes) {
            if (marktype.getName().equals(name))
                return marktype;
        }

        return null;
    }

    public String getRowKey(MarkType marktype) {
        return marktype.getName();
    }
}
