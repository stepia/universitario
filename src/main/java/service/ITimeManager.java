package service;

import java.util.List;

import entry.Time;

public interface ITimeManager {

    public List<Time> getTimes();

    public void createTime(Time time);

    public void editTime(Time time);

}
