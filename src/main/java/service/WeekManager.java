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

    public void createWeek(Week week) {
        getWeekDao().createWeek(week);
    }

    public List<Week> getWeeks() {
        return getWeekDao().getWeeks();
    }

    public void editWeek(Week week) {
        getWeekDao().editWeek(week);
    }

    public Week getWeek(Long id) {
        return getWeekDao().getWeek(id);
    }

}
