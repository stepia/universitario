package service;

import java.util.List;

import entry.Role;

public interface IRoleManager {

    public List<Role> getRoles();

    public void createRole(Role role);

    public void editRole(Role role);

}
