package dao;

import java.util.List;

import entry.Week;

public interface WeekDao {

    public List<Week> getWeeks();

    public List<Week> getWeeks(String sortBy, boolean sortOrder);

    public void saveWeek(Week week);

    public void editWeek(Week week);

    public Week getWeek(Long id);

}
