package service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import dao.AuthorityDao;
import entry.Authority;

public class AuthorityManager implements IAuthorityManager {

    private AuthorityDao authorityDao;

    public AuthorityDao getAuthorityDao() {
        return authorityDao;
    }

    public void setAuthorityDao(AuthorityDao authorityDao) {
        this.authorityDao = authorityDao;
    }

    @Transactional
    public void createAuthority(Authority role) {
        getAuthorityDao().createAuthority(role);
    }

    @Transactional
    public List<Authority> getAuthorities() {
        return getAuthorityDao().getAuthorities();
    }

    @Transactional
    public void deleteAuthority(Authority role) {
        getAuthorityDao().deleteAuthority(role);
    }

}
