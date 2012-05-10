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

import service.IUserManager;
import entry.User;

@ManagedBean
@SessionScoped
public class UserViewBean {

    @ManagedProperty(value = "#{userManager}")
    private IUserManager userManager;
    private User selectedUser;
    private List<User> users = new ArrayList<User>();
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

    public IUserManager getUserManager() {
        return userManager;
    }

    public void setUserManager(IUserManager userManager) {
        this.userManager = userManager;
    }

    public List<User> getUsers() {
        if (sortBy == null) {
            users = getUserManager().getUsers();
        } else {
            users = getUserManager().getUsers(sortBy, sortOrder);
        }
        this.length = users.size();
        return users;
    }

    public User getSelectedUser() {
        return selectedUser;
    }

    public void setSelectedUser(User selectedUser) {
        this.selectedUser = selectedUser;
    }

    public String doAction(String action) throws UnsupportedEncodingException {
        Action act = Action.fromString(action);
        switch (act)
            {
            case DELETE:
                getUserManager().deleteUser(getSelectedUser());
                break;
            case CREATE:
                setSelectedUser(new User());
                break;
            case SAVE:
                if (getSelectedUser().getCreated() != null) {
                    getUserManager().saveOrUpdate(getSelectedUser());
                } else {
                    getUserManager().saveUser(getSelectedUser());
                }
                break;
            }
        return action;
    }

    public void onRowSelect(SelectEvent event) throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("userDetail.xhtml");
        setEditible(true);
    }

    public void init() throws IOException {
        setSelectedUser(null);
        setEditible(false);
    }

    public boolean isEditible() {
        return editible;
    }

    public void setEditible(boolean editible) {
        this.editible = editible;
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
