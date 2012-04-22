package user;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import service.ITeamtypeManager;
import entry.Teamtype;

@ManagedBean
@RequestScoped
public class TeamtypeViewBean {

    private Teamtype teamtype;
    @ManagedProperty(value = "#{teamtypeManager}")
    private ITeamtypeManager teamtypeManager;
    private Teamtype selectedTeamtype;
    private Teamtype[] selectedTeamtypes;
    private List<Teamtype> teamtypes = new ArrayList<Teamtype>();

    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Teamtype[] getSelectedTeamtypes() {
        return selectedTeamtypes;
    }

    public void setSelectedTeamtypes(Teamtype[] selectedTeamtypes) {
        this.selectedTeamtypes = selectedTeamtypes;
    }

    public ITeamtypeManager getTeamtypeManager() {
        return teamtypeManager;
    }

    public void setTeamtypeManager(ITeamtypeManager teamtypeManager) {
        this.teamtypeManager = teamtypeManager;
    }

    public List<Teamtype> getTeamtypes() {
    	teamtypes = teamtypeManager.getTeamtypes();
        this.length = teamtypes.size();
        return teamtypes;
    }

    public Teamtype getSelectedTeamtype() {
        return selectedTeamtype;
    }

    public void setSelectedTeamtype(Teamtype selectedTeamtype) {
        this.selectedTeamtype = selectedTeamtype;
    }

    public Teamtype getTeamtype() {
        return teamtype;
    }

    public void setTeamtype(Teamtype teamtype) {
        this.teamtype = teamtype;
    }

}
