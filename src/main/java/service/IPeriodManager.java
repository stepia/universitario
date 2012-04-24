package service;

import java.util.List;

import entry.Period;

public interface IPeriodManager {

    public List<Period> getPeriods();

    public void createPeriod(Period period);

    public void editPeriod(Period period);

}
