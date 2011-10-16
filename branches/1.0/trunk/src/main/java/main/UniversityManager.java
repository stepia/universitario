package main;

import java.util.List;

public class UniversityManager {

	private UniversityDao universityDao;

	public void setUniversityDao(UniversityDao universityDao) {
		this.universityDao = universityDao;
	}

	public List<Decane> getDecanes() {
		return universityDao.getDecanes();
	}

}
