package service;

import java.util.List;

import dao.MarkDao;
import entry.Mark;

public class MarkManager implements MarkDao {

    private MarkDao markDao;

    public MarkDao getMarkDao() {
        return markDao;
    }

    public void setMarkDao(MarkDao markDao) {
        this.markDao = markDao;
    }

    public void saveMark(Mark mark) {
        getMarkDao().saveMark(mark);
    }

    public void saveOrUpdate(Mark mark) {
        getMarkDao().saveOrUpdate(mark);
    }

    public void deleteMark(Mark mark) {
        getMarkDao().deleteMark(mark);
    }

    public List<Mark> getMarks() {
        return getMarkDao().getMarks();
    }

    public List<Mark> getMarks(String sortBy, boolean sortOrder) {
        return getMarkDao().getMarks(sortBy, sortOrder);
    }

    public void editMark(Mark mark) {
        getMarkDao().editMark(mark);
    }

    public Mark getMark(Long id) {
        return getMarkDao().getMark(id);
    }

}
