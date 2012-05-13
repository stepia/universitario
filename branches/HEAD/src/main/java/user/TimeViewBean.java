package user;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;
import org.primefaces.event.data.SortEvent;

import dao.TimeDao;
import entry.Time;

@ManagedBean
@SessionScoped
public class TimeViewBean {

    @ManagedProperty(value = "#{timeManager}")
    private TimeDao timeManager;
    private Time selectedTime;
    private List<Time> times = new ArrayList<Time>();
    private boolean editible;
    private boolean sortOrder;
    private String sortBy;

    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public TimeDao getTimeManager() {
        return timeManager;
    }

    public void setTimeManager(TimeDao timeManager) {
        this.timeManager = timeManager;
    }

    public List<Time> getTimes() {
        if (sortBy == null) {
            times = getTimeManager().getTimes();
        } else {
            times = getTimeManager().getTimes(sortBy, sortOrder);
        }
        this.length = times.size();
        return times;
    }

    public Time getSelectedTime() {
        return selectedTime;
    }

    public void setSelectedTime(Time selectedTime) {
        this.selectedTime = selectedTime;
    }

    public void onRowSelect(SelectEvent event) throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("timeDetail.xhtml");
        setEditible(true);
    }

    public void init() throws IOException {
        setSelectedTime(null);
        setEditible(false);
    }

    public boolean isEditible() {
        return editible;
    }

    public void setEditible(boolean editible) {
        this.editible = editible;
    }

    public String doAction(String action) throws UnsupportedEncodingException {
        Action act = Action.fromString(action);
        switch (act)
            {
            case DELETE:
                getTimeManager().deleteTime(getSelectedTime());
                break;
            case CREATE:
                setSelectedTime(new Time());
                break;
            case SAVE:
                if (getSelectedTime().getCreated() != null) {
                    getTimeManager().saveOrUpdate(getSelectedTime());
                } else {
                    getTimeManager().saveTime(getSelectedTime());
                }
                break;
            }
        return action;
    }

    public void caseListSortListner(SortEvent sortEvent) {
        setSortBy(sortEvent.getSortColumn().getId());
        if (sortEvent.isAscending()) {
            setSortOrder(true);
        } else {
            setSortOrder(false);
        }
    }

    public boolean isSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(boolean sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

}
