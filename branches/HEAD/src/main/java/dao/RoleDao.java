package dao;

import java.util.List;

import entry.Role;

public interface RoleDao {

    public List<Role> getRoles();

    public void createRole(Role role);

    public void editRole(Role role);

    public Role getRole(Long id);

}
