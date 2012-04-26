package service;

import java.util.List;

import dao.TimeDao;
import entry.Time;

public class TimeManager implements ITimeManager {

    private TimeDao timeDao;

    public TimeDao getTimeDao() {
        return timeDao;
    }

    public void setTimeDao(TimeDao timeDao) {
        this.timeDao = timeDao;
    }

    public void createTime(Time time) {
        getTimeDao().createTime(time);
    }

    public List<Time> getTimes() {
        return getTimeDao().getTimes();
    }

    public void editTime(Time time) {
        getTimeDao().editTime(time);
    }

    public Time getTime(Long id) {
        return getTimeDao().getTime(id);
    }

}
