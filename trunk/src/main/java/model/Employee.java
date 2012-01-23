package model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Employee {

	private byte course;

	private boolean isDebt;

	public byte getCourse() {
		return course;
	}

	public void setCourse(byte course) {
		this.course = course;
	}

	public boolean isDebt() {
		return isDebt;
	}

	public void setDebt(boolean isDebt) {
		this.isDebt = isDebt;
	}

}
