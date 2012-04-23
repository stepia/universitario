package user;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import service.IRoleManager;
import entry.Role;

@ManagedBean
@RequestScoped
public class RoleViewBean {

    private Role role;
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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

}
