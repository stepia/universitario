package user;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import org.primefaces.event.SelectEvent;
import org.primefaces.event.data.SortEvent;

import dao.UserIPersonDao;
import entry.UserIPerson;

@ManagedBean
@SessionScoped
public class UserIPersonViewBean {

    @ManagedProperty(value = "#{userIPersonManager}")
    private UserIPersonDao userIPersonManager;
    private UserIPerson selectedUserIPerson;
    private List<UserIPerson> userIPersons = new ArrayList<UserIPerson>();
    private boolean editible;
    private boolean sortOrder;
    private String sortBy;
    private SelectItem[] enabledOptions = new SelectItem[3];

    public SelectItem[] getEnabledOptions() {
        return enabledOptions;
    }

    public void setEnabledOptions(SelectItem[] enabledOptions) {
        this.enabledOptions = enabledOptions;
    }

    public UserIPersonViewBean() {
        enabledOptions[0] = new SelectItem("", "Select");
        enabledOptions[1] = new SelectItem("true", "Active");
        enabledOptions[2] = new SelectItem("false", "Not active");
    }

    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public List<UserIPerson> getUserIPersons() {
        if (sortBy == null) {
            userIPersons = getUserIPersonManager().getUserIPersons();
        } else {
            if (!sortBy.equals("person")) {
                userIPersons = getUserIPersonManager().getUserIPersons(sortBy, sortOrder);
            }
        }
        this.length = userIPersons.size();
        return userIPersons;
    }

    public UserIPerson getSelectedUserIPerson() {
        return selectedUserIPerson;
    }

    public void setSelectedUserIPerson(UserIPerson selectedUserIPerson) {
        this.selectedUserIPerson = selectedUserIPerson;
    }

    public void onRowSelect(SelectEvent event) throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("userIPersonDetail.xhtml");
        setEditible(true);
    }

    public void init() throws IOException {
        setSelectedUserIPerson(null);
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
                getUserIPersonManager().deleteUserIPerson(getSelectedUserIPerson());
                break;
            case CREATE:
                setSelectedUserIPerson(new UserIPerson());
                break;
            case SAVE:
                if (getSelectedUserIPerson().getCreated() != null) {
                    getUserIPersonManager().saveOrUpdate(getSelectedUserIPerson());
                } else {
                    getUserIPersonManager().saveUserIPerson(getSelectedUserIPerson());
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

    public UserIPersonDao getUserIPersonManager() {
        return userIPersonManager;
    }

    public void setUserIPersonManager(UserIPersonDao userIPersonManager) {
        this.userIPersonManager = userIPersonManager;
    }

}
