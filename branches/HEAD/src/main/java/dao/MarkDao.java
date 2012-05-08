package dao;

import java.util.List;

import entry.Mark;

public interface MarkDao {

    public List<Mark> getMarks();

    public List<Mark> getMarks(String sortBy, boolean sortOrder);

    public void saveMark(Mark mark);

    public void editMark(Mark mark);

    public Mark getMark(Long id);

    public void deleteMark(Mark mark);

    public void saveOrUpdate(Mark mark);

}
