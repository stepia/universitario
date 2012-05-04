package dao;

import java.util.List;

import entry.Time;

public interface TimeDao {

    public List<Time> getTimes();

    public List<Time> getTimes(String sortBy, boolean sortOrder);

    public void saveTime(Time time);

    public void editTime(Time time);

    public Time getTime(Long id);

}
