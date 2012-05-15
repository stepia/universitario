package entry;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class TeamView {
    private long id;
    private String name;
    private TeamType teamtype;
    private List<TeamView> roots = new ArrayList<TeamView>();
    private List<TeamView> children = new ArrayList<TeamView>();
    private String details;
    private State state;
    private Date created;
    private Date modified;
    private List<EmpTeam> empTeams = new ArrayList<EmpTeam>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public TeamType getTeamtype() {
        return teamtype;
    }

    public void setTeamtype(TeamType teamtype) {
        this.teamtype = teamtype;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public List<TeamView> getRoots() {
        return roots;
    }

    public void setRoots(List<TeamView> roots) {
        this.roots = roots;
    }

    public List<EmpTeam> getEmpTeams() {
        return empTeams;
    }

    public void setEmpTeams(List<EmpTeam> empTeams) {
        this.empTeams = empTeams;
    }

    public List<TeamView> getChildren() {
        return children;
    }

    public void setChildren(List<TeamView> children) {
        this.children = children;
    }

}
