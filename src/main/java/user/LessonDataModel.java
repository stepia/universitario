package user;

import java.util.List;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

import entry.Lesson;

public class LessonDataModel extends ListDataModel<Lesson> implements SelectableDataModel<Lesson> {

    public LessonDataModel() {
    }

    public LessonDataModel(List<Lesson> data) {
        super(data);
    }

    public Lesson getRowData(String rowKey) {

        @SuppressWarnings("unchecked")
        List<Lesson> lessons = (List<Lesson>) getWrappedData();

        for (Lesson lesson : lessons) {
            if (lesson.getId().equals(rowKey))
                return lesson;
        }

        return null;
    }

    public Long getRowKey(Lesson lesson) {
        return lesson.getId();
    }
}
