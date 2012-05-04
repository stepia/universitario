package service;

import java.util.List;

import dao.MarkTypeDao;
import entry.MarkType;

public class MarkTypeManager implements IMarkTypeManager {

    private MarkTypeDao markTypeDao;

    public MarkTypeDao getMarkTypeDao() {
        return markTypeDao;
    }

    public void setMarkTypeDao(MarkTypeDao markTypeDao) {
        this.markTypeDao = markTypeDao;
    }

    public void saveMarkType(MarkType markType) {
        getMarkTypeDao().saveMarkType(markType);
    }

    public List<MarkType> getMarkTypes() {
        return getMarkTypeDao().getMarkTypes();
    }

    public List<MarkType> getMarkTypes(String sortBy, boolean sortOrder) {
        return getMarkTypeDao().getMarkTypes(sortBy, sortOrder);
    }

    public void editMarkType(MarkType markType) {
        getMarkTypeDao().editMarkType(markType);
    }

    public MarkType getMarkType(String name) {
        return getMarkTypeDao().getMarkType(name);
    }

}
