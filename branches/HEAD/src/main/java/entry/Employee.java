package entry;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Employee {

	private String state;
	private Long id;
	private String usrname;
	//private Long userId;

//	public Long getUserId() {
//		return userId;
//	}
//
//	public void setUserId(Long userId) {
//		this.userId = userId;
//	}
	
	

	public Long getId() {
		return id;
	}







	public String getUsrname() {
		return usrname;
	}







	public void setUsrname(String usrname) {
		this.usrname = usrname;
	}







	public void setId(Long id) {
		this.id = id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
