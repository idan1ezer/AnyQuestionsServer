package anyQuestions.boundaries;

import java.util.Date;

public class QuestionAnswerBoundary {
	
	 	//private String id;
//	    private String courseId;
//	    private String groupId;
//	    private String lectureId;

	    private String question;
	    private String answer;
	    private int likes;
	    private Date timestamp;
	    
	    public QuestionAnswerBoundary() {
	    	
	    }

	    public QuestionAnswerBoundary( String question, String answer, int likes, Date timestamp) {
//	        this.courseId = courseId;
//	        this.groupId = groupId;
//	        this.lectureId = lectureId;
	        this.question = question;
	        this.answer = answer;
	        this.likes = likes;
	        this.timestamp = timestamp;
	      //  generateID();
	    }

	    //private void generateID(){
	      //  this.id = courseId+groupId+lectureId;
	    //}

//	    public String getCourseId() {
//	        return courseId;
//	    }
//
//	    public void setCourseId(String courseId) {
//	        this.courseId = courseId;
//	    }
//
//	    public String getGroupId() {
//	        return groupId;
//	    }
//
//	    public void setGroupId(String groupId) {
//	        this.groupId = groupId;
//	    }
//
//	    public String getLectureId() {
//	        return lectureId;
//	    }
//
//	    public void setLectureId(String lectureId) {
//	        this.lectureId = lectureId;
//	    }

	    public String getQuestion() {
	        return question;
	    }

	    public void setQuestion(String question) {
	        this.question = question;
	    }

	    public String getAnswer() {
	        return answer;
	    }

	    public void setAnswer(String answer) {
	        this.answer = answer;
	    }

	    public int getLikes() {
	        return likes;
	    }

	    public void setLikes(int likes) {
	        this.likes = likes;
	    }

	    public Date getTimestamp() {
	        return timestamp;
	    }

	    public void setTimestamp(Date timestamp) {
	        this.timestamp = timestamp;
	    }

	    @Override
	    public String toString() {
	        return "QuestionAnswer{" +
//	                ", courseId='" + courseId + '\'' +
//	                ", groupId='" + groupId + '\'' +
//	                ", lectureId='" + lectureId + '\'' +
	                ", question='" + question + '\'' +
	                ", Answer='" + answer + '\'' +
	                ", likes=" + likes +
	                ", timestamp=" + timestamp +
	                '}';
	    }
}
