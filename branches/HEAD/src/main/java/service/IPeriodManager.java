package service;

import java.util.List;

import entry.Period;

public interface IPeriodManager {

    public List<Period> getPeriods();

    public void savePeriod(Period period);

    public void editPeriod(Period period);

    public List<Period> getPeriods(String sortBy, boolean sortOrder);

}
