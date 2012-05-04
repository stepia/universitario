package service;

import java.util.List;

import dao.RoleDao;
import entry.Role;

public class RoleManager implements IRoleManager {

    private RoleDao roleDao;

    public RoleDao getRoleDao() {
        return roleDao;
    }

    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    public void saveRole(Role role) {
        getRoleDao().saveRole(role);
    }

    public List<Role> getRoles() {
        return getRoleDao().getRoles();
    }

    public List<Role> getRoles(String sortBy, boolean sortOrder) {
        return getRoleDao().getRoles(sortBy, sortOrder);
    }

    public void editRole(Role role) {
        getRoleDao().editRole(role);
    }

    public Role getRole(Long id) {
        return getRoleDao().getRole(id);
    }

}
