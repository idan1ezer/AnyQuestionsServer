package anyQuestions.boundaries;

import java.util.ArrayList;
import java.util.List;



public class GroupBoundary {


	private String ID;
	private String lecturerID;
	private String courseId;
	private List<LectureBoundary>lectures = new ArrayList<>();

	
	public GroupBoundary() {
		
	}

	
	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}


	

	public String getID() {
		return ID;
	}


	public void setID(String iD) {
		ID = iD;
	}


	public String getLecturerID() {
		return lecturerID;
	}


	public void setLecturerID(String lecturerID) {
		this.lecturerID = lecturerID;
	}


	public List<LectureBoundary> getLectures() {
		return lectures;
	}

	public void setLectures(List<LectureBoundary> lectures) {
		this.lectures = lectures;
	}

	
	@Override
	public String toString() {
		return "GroupBoundary [ID=" + ID + ", lecturerID=" + lecturerID +  ", lectures="
				+ lectures + "]";
	}

	

	
	}

	
