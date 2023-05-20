package anyQuestions.boundaries;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LectureBoundary {
	
	private long id;
    private boolean permission;
    private Date timestamp;
    private int lectureNumber;
    private List<QuestionAnswerBoundary>summary = new ArrayList<>();
   

    public LectureBoundary() {
    	
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
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

	public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
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
