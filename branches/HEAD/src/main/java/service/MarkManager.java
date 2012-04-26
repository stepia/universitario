package service;

import java.util.List;

import dao.MarkDao;
import entry.Mark;

public class MarkManager implements IMarkManager {

    private MarkDao markDao;

    public MarkDao getMarkDao() {
        return markDao;
    }

    public void setMarkDao(MarkDao markDao) {
        this.markDao = markDao;
    }

    public void createMark(Mark mark) {
        getMarkDao().createMark(mark);
    }

    public List<Mark> getMarks() {
        return getMarkDao().getMarks();
    }

    public void editMark(Mark mark) {
        getMarkDao().editMark(mark);
    }

    public Mark getMark(String name) {
        return getMarkDao().getMark(name);
    }

}
