package service;

import java.util.List;

import entry.Mark;

public interface IMarkManager {

    public List<Mark> getMarks();

    public void saveMark(Mark mark);

    public void editMark(Mark mark);

    public List<Mark> getMarks(String sortBy, boolean sortOrder);

    public void deleteMark(Mark mark);

    public void saveOrUpdate(Mark mark);

}
