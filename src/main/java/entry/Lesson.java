package entry;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Lesson {

	private Long id;
	private Long planid;
	private Long facultyid;
	private String room;
	private Long lessontimeid;
	private Long dayid;
	private Long weekid;
    private Date created;
    private Date modified;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getPlanid() {
        return planid;
    }

    public void setPlanid(Long planid) {
        this.planid = planid;
    }
    
    public Long getFacultyid() {
        return facultyid;
    }

    public void setFacultyid(Long facultyid) {
        this.facultyid = facultyid;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }
    
    public Long getLessontimeid() {
        return lessontimeid;
    }

    public void setLessontimeid(Long lessontimeid) {
        this.lessontimeid = lessontimeid;
    }
    
    public Long getDayid() {
        return dayid;
    }

    public void setDayid(Long dayid) {
        this.dayid = dayid;
    }
    
    public Long getWeekid() {
        return weekid;
    }

    public void setWeekid(Long weekid) {
        this.weekid = weekid;
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
