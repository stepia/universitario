package service;

import java.util.List;

import entry.Authority;

public interface IAuthorityManager {

    public void createAuthority(Authority role);

    public List<Authority> getAuthorities();

    public void deleteAuthority(Authority role);
}