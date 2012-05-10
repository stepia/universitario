package user;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;
import org.primefaces.event.data.SortEvent;

import service.IAuthorityManager;
import entry.Authority;

@ManagedBean
@SessionScoped
public class AuthorityViewBean {

    @ManagedProperty(value = "#{authorityManager}")
    private IAuthorityManager authorityManager;
    private Authority selectedAuthority;
    private List<Authority> authorities = new ArrayList<Authority>();
    private boolean editible;
    private boolean sortOrder;
    private String sortBy;

    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public IAuthorityManager getAuthorityManager() {
        return authorityManager;
    }

    public void setAuthorityManager(IAuthorityManager authorityManager) {
        this.authorityManager = authorityManager;
    }

    public List<Authority> getAuthorities() {
    	if (sortBy == null) {
    		authorities = getAuthorityManager().getAuthorities();
        } else {
        	authorities = getAuthorityManager().getAuthorities(sortBy, sortOrder);
        }
        this.length = authorities.size();
        return authorities;
    }

    public Authority getSelectedAuthority() {
        return selectedAuthority;
    }

    public void setSelectedAuthority(Authority selectedAuthority) {
        this.selectedAuthority = selectedAuthority;
    }
    
    public void onRowSelect(SelectEvent event) throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("authorityDetail.xhtml");
        setEditible(true);
    }

    public void init() throws IOException {
        setSelectedAuthority(null);
        setEditible(false);
    }
    
    public boolean isEditible() {
        return editible;
    }

    public void setEditible(boolean editible) {
        this.editible = editible;
    }

    public String doAction(String action) throws UnsupportedEncodingException {
        Action act = Action.fromString(action);
        switch (act)
            {
            case DELETE:
            	getAuthorityManager().deleteAuthority(getSelectedAuthority());
                break;
            case CREATE:
                setSelectedAuthority(new Authority());
                break;
            case SAVE:
            	if (getSelectedAuthority().getCreated() != null) {
                    getAuthorityManager().saveOrUpdate(getSelectedAuthority());
                } else {
                    getAuthorityManager().saveAuthority(getSelectedAuthority());
                }
                break;
            }
        return action;
    }
    
    public void caseListSortListner(SortEvent sortEvent) {
        setSortBy(sortEvent.getSortColumn().getId());
        if (sortEvent.isAscending()) {
            setSortOrder(true);
        } else {
            setSortOrder(false);
        }
    }

    public boolean isSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(boolean sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

}
