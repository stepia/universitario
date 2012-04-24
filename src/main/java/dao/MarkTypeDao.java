package dao;

import java.util.List;

import entry.MarkType;

public interface MarkTypeDao {

    public List<MarkType> getMarkTypes();

    public void createMarkType(MarkType markType);

    public void editMarkType(MarkType markType);

    public MarkType getMarkType(String name);

}
