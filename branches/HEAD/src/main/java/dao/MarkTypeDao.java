package dao;

import java.util.List;

import entry.MarkType;

public interface MarkTypeDao {

    public List<MarkType> getMarkTypes();

    public List<MarkType> getMarkTypes(String sortBy, boolean sortOrder);

    public void saveMarkType(MarkType markType);

    public void editMarkType(MarkType markType);

    public MarkType getMarkType(String name);

}
