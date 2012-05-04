package service;

import java.util.List;

import entry.Role;

public interface IRoleManager {

    public List<Role> getRoles();

    public void saveRole(Role role);

    public void editRole(Role role);

    public List<Role> getRoles(String sortBy, boolean sortOrder);

}
