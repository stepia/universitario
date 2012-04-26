package service;

import java.util.List;

import entry.Mark;

public interface IMarkManager {

    public List<Mark> getMarks();

    public void createMark(Mark mark);

    public void editMark(Mark mark);

}
