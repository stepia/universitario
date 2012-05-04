package dao;

import java.util.List;

import entry.Period;

public interface PeriodDao {

    public List<Period> getPeriods();

    public List<Period> getPeriods(String sortBy, boolean sortOrder);

    public void savePeriod(Period period);

    public void editPeriod(Period period);

    public Period getPeriod(Long id);

}
