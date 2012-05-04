package service;

import java.util.List;

import dao.WeekDao;
import entry.Week;

public class WeekManager implements IWeekManager {

    private WeekDao weekDao;

    public WeekDao getWeekDao() {
        return weekDao;
    }

    public void setWeekDao(WeekDao weekDao) {
        this.weekDao = weekDao;
    }

    public void saveWeek(Week week) {
        getWeekDao().saveWeek(week);
    }

    public List<Week> getWeeks() {
        return getWeekDao().getWeeks();
    }

    public List<Week> getWeeks(String sortBy, boolean sortOrder) {
        return getWeekDao().getWeeks(sortBy, sortOrder);
    }

    public void editWeek(Week week) {
        getWeekDao().editWeek(week);
    }

    public Week getWeek(Long id) {
        return getWeekDao().getWeek(id);
    }

}
