package dao;

import java.util.List;

import entry.Period;

public interface PeriodDao {

    public List<Period> getPeriods();

    public void createPeriod(Period period);

    public void editPeriod(Period period);

    public Period getPeriod(String value);

}
