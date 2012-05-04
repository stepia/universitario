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

    public void savePeriod(Period period) {
        getPeriodDao().savePeriod(period);
    }

    public List<Period> getPeriods() {
        return getPeriodDao().getPeriods();
    }

    public List<Period> getPeriods(String sortBy, boolean sortOrder) {
        return getPeriodDao().getPeriods(sortBy, sortOrder);
    }

    public void editPeriod(Period period) {
        getPeriodDao().editPeriod(period);
    }

    public Period getPeriod(Long id) {
        return getPeriodDao().getPeriod(id);
    }

}
