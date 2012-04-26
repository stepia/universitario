package user;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import service.ITimeManager;
import entry.Time;

@ManagedBean
@RequestScoped
public class TimeViewBean {

    private Time time;
    @ManagedProperty(value = "#{timeManager}")
    private ITimeManager timeManager;
    private Time selectedTime;
    private Time[] selectedTimes;
    private List<Time> times = new ArrayList<Time>();

    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Time[] getSelectedTimes() {
        return selectedTimes;
    }

    public void setSelectedTimes(Time[] selectedTimes) {
        this.selectedTimes = selectedTimes;
    }

    public ITimeManager getTimeManager() {
        return timeManager;
    }

    public void setTimeManager(ITimeManager timeManager) {
        this.timeManager = timeManager;
    }

    public List<Time> getTimes() {
    	times = timeManager.getTimes();
        this.length = times.size();
        return times;
    }

    public Time getSelectedTime() {
        return selectedTime;
    }

    public void setSelectedTime(Time selectedTime) {
        this.selectedTime = selectedTime;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

}
