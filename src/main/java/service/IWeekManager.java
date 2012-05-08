package service;

import java.util.List;

import entry.Week;

public interface IWeekManager {

    public List<Week> getWeeks();

    public void saveWeek(Week week);

    public void editWeek(Week week);

    public List<Week> getWeeks(String sortBy, boolean sortOrder);

    public void deleteWeek(Week week);

    public void saveOrUpdate(Week week);

}
