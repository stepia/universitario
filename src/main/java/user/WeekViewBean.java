package user;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import service.IWeekManager;
import entry.Week;

@ManagedBean
@RequestScoped
public class WeekViewBean {

    private Week week;
    @ManagedProperty(value = "#{weekManager}")
    private IWeekManager weekManager;
    private Week selectedWeek;
    private Week[] selectedWeeks;
    private List<Week> weeks = new ArrayList<Week>();

    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Week[] getSelectedWeeks() {
        return selectedWeeks;
    }

    public void setSelectedWeeks(Week[] selectedWeeks) {
        this.selectedWeeks = selectedWeeks;
    }

    public IWeekManager getWeekManager() {
        return weekManager;
    }

    public void setWeekManager(IWeekManager weekManager) {
        this.weekManager = weekManager;
    }

    public List<Week> getWeeks() {
    	weeks = weekManager.getWeeks();
        this.length = weeks.size();
        return weeks;
    }

    public Week getSelectedWeek() {
        return selectedWeek;
    }

    public void setSelectedWeek(Week selectedWeek) {
        this.selectedWeek = selectedWeek;
    }

    public Week getWeek() {
        return week;
    }

    public void setWeek(Week week) {
        this.week = week;
    }

}
