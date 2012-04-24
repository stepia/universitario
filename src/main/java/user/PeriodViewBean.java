package user;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import service.IPeriodManager;
import entry.Period;

@ManagedBean
@RequestScoped
public class PeriodViewBean {

    private Period period;
    @ManagedProperty(value = "#{periodManager}")
    private IPeriodManager periodManager;
    private Period selectedPeriod;
    private Period[] selectedPeriods;
    private List<Period> periods = new ArrayList<Period>();

    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Period[] getSelectedPeriods() {
        return selectedPeriods;
    }

    public void setSelectedPeriods(Period[] selectedPeriods) {
        this.selectedPeriods = selectedPeriods;
    }

    public IPeriodManager getPeriodManager() {
        return periodManager;
    }

    public void setPeriodManager(IPeriodManager periodManager) {
        this.periodManager = periodManager;
    }

    public List<Period> getPeriods() {
    	periods = periodManager.getPeriods();
        this.length = periods.size();
        return periods;
    }

    public Period getSelectedPeriod() {
        return selectedPeriod;
    }

    public void setSelectedPeriod(Period selectedPeriod) {
        this.selectedPeriod = selectedPeriod;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

}
