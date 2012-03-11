package web;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import service.AuthorityManager;
import entry.Authority;

@ManagedBean
@SessionScoped
public class AuthorityInfo {

    @ManagedProperty(value = "#{authorityManager}")
    private AuthorityManager authorityManager;

    public AuthorityManager getAuthorityManager() {
        return authorityManager;
    }

    public void setAuthorityManager(AuthorityManager authorityManager) {
        this.authorityManager = authorityManager;
    }

    private List<Authority> authorities;

    public List<Authority> getAuthorities() {
        authorities = this.getAuthorityManager().getAuthorities();
        return authorities;
    }

}
