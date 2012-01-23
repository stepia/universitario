package core;

import java.util.List;

import model.Decane;

public class UniversityManager {

	private UniversityDao universityDao;

	public void setUniversityDao(UniversityDao universityDao) {
		this.universityDao = universityDao;
	}

	public List<Decane> getDecanes() {
		return universityDao.getDecanes();
	}

}
