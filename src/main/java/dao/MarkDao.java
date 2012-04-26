package dao;

import java.util.List;

import entry.Mark;

public interface MarkDao {

    public List<Mark> getMarks();

    public void createMark(Mark mark);

    public void editMark(Mark mark);

    public Mark getMark(String name);

}
