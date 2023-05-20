package anyQuestions.boundaries;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LectureBoundary {
	
	private String id;
    private boolean permission;
    private String timestamp;
    private int lectureNumber;
    private List<QuestionAnswerBoundary>summary = new ArrayList<>();
   

    public LectureBoundary() {
    	
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean getPermission() {
        return permission;
    }

    public void setPermission(boolean live) {
        permission = live;
    }



    public List<QuestionAnswerBoundary> getSummary() {
		return summary;
	}

	public void setSummary(List<QuestionAnswerBoundary> summary) {
		this.summary = summary;
	}

	public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
    
    public int getLectureNumber() {
    	return this.lectureNumber;
    }
    
    public void setLectureNumber(int lectureNumber) {
    	this.lectureNumber = lectureNumber;
    }

	@Override
	public String toString() {
		return "LectureBoundary [id=" + id + ", permission=" + permission + ", timestamp=" + timestamp + ", summary=" + summary + "]";
	}
    

}
