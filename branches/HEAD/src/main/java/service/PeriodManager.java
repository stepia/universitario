package service;

import java.util.List;

import dao.PeriodDao;
import entry.Period;

public class PeriodManager implements IPeriodManager {

    private PeriodDao periodDao;

    public PeriodDao getPeriodDao() {
        return periodDao;
    }

    public void setPeriodDao(PeriodDao periodDao) {
        this.periodDao = periodDao;
    }

    public void createPeriod(Period period) {
        getPeriodDao().createPeriod(period);
    }

    public List<Period> getPeriods() {
        return getPeriodDao().getPeriods();
    }

    public void editPeriod(Period period) {
        getPeriodDao().editPeriod(period);
    }

    public Period getPeriod(String value) {
        return getPeriodDao().getPeriod(value);
    }

}
