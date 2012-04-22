package entry;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Emp2Team {

    private Long id;
    private Long empid;
    private Long teamid;
    private Long positionid;
    private Long occupationid;
    private Long stateid;
    private Date created;
    private Date modified;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getempid() {
        return empid;
    }

    public void setempid(Long empid) {
        this.empid = empid;
    }

    public Long getteamid() {
        return teamid;
    }

    public void setteamid(Long teamid) {
        this.teamid = teamid;
    }

    public Long getpositionid() {
        return positionid;
    }

    public void setpositionid(Long positionid) {
        this.positionid = positionid;
    }

    public Long getoccupationid() {
        return occupationid;
    }

    public void setoccupationid(Long occupationid) {
        this.occupationid = occupationid;
    }
    
    public Long getstateid() {
        return stateid;
    }

    public void setstateid(Long stateid) {
        this.stateid = stateid;
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

}
