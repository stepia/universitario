package service;

import java.util.List;

import entry.Authority;

public interface IAuthorityManager {

    public List<Authority> getAuthorities();

    public void saveAuthority(Authority authority);

    public void editAuthority(Authority authority);
    
    public List<Authority> getAuthorities(String sortBy, boolean sortOrder);

    public void deleteAuthority(Authority authority);

    public void saveOrUpdate(Authority authority);
    
}