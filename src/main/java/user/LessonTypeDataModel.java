package user;

import java.util.List;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

import entry.LessonType;

public class LessonTypeDataModel extends ListDataModel<LessonType> implements SelectableDataModel<LessonType> {

    public LessonTypeDataModel() {
    }

    public LessonTypeDataModel(List<LessonType> data) {
        super(data);
    }

    public LessonType getRowData(String rowKey) {
    	Long id = Long.valueOf(rowKey);

        @SuppressWarnings("unchecked")
        List<LessonType> lessonTypes = (List<LessonType>) getWrappedData();

        for (LessonType lessonType : lessonTypes) {
            if (lessonType.getId().equals(id))
                return lessonType;
        }

        return null;
    }

    public Long getRowKey(LessonType lessonType) {
        return lessonType.getId();
    }
}
