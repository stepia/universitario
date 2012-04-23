package user;

import java.util.List;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

import entry.Lessontype;

public class LessontypeDataModel extends ListDataModel<Lessontype> implements SelectableDataModel<Lessontype> {

    public LessontypeDataModel() {
    }

    public LessontypeDataModel(List<Lessontype> data) {
        super(data);
    }

    public Lessontype getRowData(String rowKey) {

        @SuppressWarnings("unchecked")
        List<Lessontype> lessontypes = (List<Lessontype>) getWrappedData();

        for (Lessontype lessontype : lessontypes) {
            if (lessontype.getName().equals(rowKey))
                return lessontype;
        }

        return null;
    }

    public String getRowKey(Lessontype lessontype) {
        return lessontype.getName();
    }
}
