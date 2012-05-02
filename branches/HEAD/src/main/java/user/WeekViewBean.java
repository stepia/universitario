package user;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;

import service.IWeekManager;
import entry.Week;

@ManagedBean
@SessionScoped
public class WeekViewBean {

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

    public void onRowSelect(SelectEvent event) throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("weekDetail.xhtml");
    }

    public void init() throws IOException {
        setSelectedWeek(null);
    }

}
