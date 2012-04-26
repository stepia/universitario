package dao;

import java.util.List;

import entry.Week;

public interface WeekDao {

    public List<Week> getWeeks();

    public void createWeek(Week week);

    public void editWeek(Week week);

    public Week getWeek(Long id);

}
