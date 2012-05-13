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

import dao.PeriodDao;
import entry.Period;

@ManagedBean
@SessionScoped
public class PeriodViewBean {

    @ManagedProperty(value = "#{periodManager}")
    private PeriodDao periodManager;
    private Period selectedPeriod;
    private List<Period> periods = new ArrayList<Period>();
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

    public PeriodDao getPeriodManager() {
        return periodManager;
    }

    public void setPeriodManager(PeriodDao periodManager) {
        this.periodManager = periodManager;
    }

    public List<Period> getPeriods() {
        if (sortBy == null) {
            periods = getPeriodManager().getPeriods();
        } else {
            periods = getPeriodManager().getPeriods(sortBy, sortOrder);
        }
        this.length = periods.size();
        return periods;
    }

    public Period getSelectedPeriod() {
        return selectedPeriod;
    }

    public void setSelectedPeriod(Period selectedPeriod) {
        this.selectedPeriod = selectedPeriod;
    }

    public void onRowSelect(SelectEvent event) throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("periodDetail.xhtml");
        setEditible(true);
    }

    public void init() throws IOException {
        setSelectedPeriod(null);
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
                getPeriodManager().deletePeriod(getSelectedPeriod());
                break;
            case CREATE:
                setSelectedPeriod(new Period());
                break;
            case SAVE:
                if (getSelectedPeriod().getCreated() != null) {
                    getPeriodManager().saveOrUpdate(getSelectedPeriod());
                } else {
                    getPeriodManager().savePeriod(getSelectedPeriod());
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
