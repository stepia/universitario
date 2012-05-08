package service;

import java.util.List;

import entry.MarkType;

public interface IMarkTypeManager {

    public List<MarkType> getMarkTypes();

    public void saveMarkType(MarkType markType);

    public void editMarkType(MarkType markType);

    public List<MarkType> getMarkTypes(String sortBy, boolean sortOrder);

    public void deleteMarkType(MarkType markType);

    public void saveOrUpdate(MarkType markType);

}
