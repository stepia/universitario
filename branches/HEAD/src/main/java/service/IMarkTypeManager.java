package service;

import java.util.List;

import entry.MarkType;

public interface IMarkTypeManager {

    public List<MarkType> getMarkTypes();

    public void createMarkType(MarkType markType);

    public void editMarkType(MarkType markType);

}
