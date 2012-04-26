package service;

import java.util.List;

import entry.Week;

public interface IWeekManager {

    public List<Week> getWeeks();

    public void createWeek(Week week);

    public void editWeek(Week week);

}
