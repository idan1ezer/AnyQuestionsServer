package anyQuestions.boundaries;

import java.util.Date;

public class QuestionAnswerBoundary {
	
	 	//private String id;
//	    private String courseId;
//	    private String groupId;
//	    private String lectureId;
		private String id;
	    private String question;
	    private String answer;
	    private int likes;
	    private String timestamp;
	    
	    public QuestionAnswerBoundary() {
	    	
	    }

	    public QuestionAnswerBoundary( String id, String question, String answer, int likes, String timestamp) {
//	        this.courseId = courseId;
//	        this.groupId = groupId;
//	        this.lectureId = lectureId;
			this.id = id;
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
		public String getId(){
			return this.id;
		}

		public void setId(String id){
			this.id = id;
		}
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

	    public String getTimestamp() {
	        return timestamp;
	    }

	    public void setTimestamp(String timestamp) {
	        this.timestamp = timestamp;
	    }

	@Override
	public String toString() {
		return "QuestionAnswerBoundary{" +
				"id='" + id + '\'' +
				", question='" + question + '\'' +
				", answer='" + answer + '\'' +
				", likes=" + likes +
				", timestamp=" + timestamp +
				'}';
	}
}
