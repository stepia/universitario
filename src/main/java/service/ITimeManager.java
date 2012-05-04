package service;

import java.util.List;

import entry.Time;

public interface ITimeManager {

    public List<Time> getTimes();

    public void saveTime(Time time);

    public void editTime(Time time);

    public List<Time> getTimes(String sortBy, boolean sortOrder);

}
