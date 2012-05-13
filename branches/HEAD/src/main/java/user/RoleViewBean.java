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

import dao.RoleDao;
import entry.Role;

@ManagedBean
@SessionScoped
public class RoleViewBean {

    @ManagedProperty(value = "#{roleManager}")
    private RoleDao roleManager;
    private Role selectedRole;
    private List<Role> roles = new ArrayList<Role>();
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

    public RoleDao getRoleManager() {
        return roleManager;
    }

    public void setRoleManager(RoleDao roleManager) {
        this.roleManager = roleManager;
    }

    public List<Role> getRoles() {
        if (sortBy == null) {
            roles = getRoleManager().getRoles();
        } else {
            roles = getRoleManager().getRoles(sortBy, sortOrder);
        }
        this.length = roles.size();
        return roles;
    }

    public Role getSelectedRole() {
        return selectedRole;
    }

    public void setSelectedRole(Role selectedRole) {
        this.selectedRole = selectedRole;
    }

    public void onRowSelect(SelectEvent event) throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("roleDetail.xhtml");
        setEditible(true);
    }

    public void init() throws IOException {
        setSelectedRole(null);
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
                getRoleManager().deleteRole(getSelectedRole());
                break;
            case CREATE:
                setSelectedRole(new Role());
                break;
            case SAVE:
                if (getSelectedRole().getCreated() != null) {
                    getRoleManager().saveOrUpdate(getSelectedRole());
                } else {
                    getRoleManager().saveRole(getSelectedRole());
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
