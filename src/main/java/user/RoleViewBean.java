package user;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;

import service.IRoleManager;
import entry.Role;

@ManagedBean
@SessionScoped
public class RoleViewBean {

    @ManagedProperty(value = "#{roleManager}")
    private IRoleManager roleManager;
    private Role selectedRole;
    private Role[] selectedRoles;
    private List<Role> roles = new ArrayList<Role>();

    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Role[] getSelectedRoles() {
        return selectedRoles;
    }

    public void setSelectedRoles(Role[] selectedRoles) {
        this.selectedRoles = selectedRoles;
    }

    public IRoleManager getRoleManager() {
        return roleManager;
    }

    public void setRoleManager(IRoleManager roleManager) {
        this.roleManager = roleManager;
    }

    public List<Role> getRoles() {
    	roles = roleManager.getRoles();
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
    }

    public void init() throws IOException {
        setSelectedRole(null);
    }

}
