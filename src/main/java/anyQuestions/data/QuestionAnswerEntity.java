package anyQuestions.data;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Questions_Table")
public class QuestionAnswerEntity {
	

	@Id
    @Column(name = "questionAnswer_id")
    private String id;
 
//    @Column(name = "course_id", nullable = false)
//    private String courseId;
// 
//    @Column(name = "group_id", nullable = false)
//    private String groupId;
// 
//    @Column(name = "lecture_id", nullable = false)
//    private String lectureId;
 
    @Column(name = "qTranscript", nullable = false)
    private String qTranscript;
 
    @Column(name = "aTranscript", nullable = true)
    private String aTranscript;
 
    @Column(name = "likes", nullable = false)
    private int likes;
 
    @Column(name = "timestamp", nullable = true)
    private Date timestamp;

    @Column(name = "qAudioLen", nullable = false)
	private float qAudioLen;
    @Column(name = "aAudioLen", nullable = false)
	private float aAudioLen;

	@ManyToOne
    @JoinColumn(name = "lecture")
    private LectureEntity lecture;

   


	public QuestionAnswerEntity() {
    	
    }
	
	


	public QuestionAnswerEntity(String id, String qTranscript,
			String aTranscript, int likes, Date timestamp, float qAudioLen, float aAudioLen) {
		super();
		this.id = id;
//		this.courseId = courseId;
//		this.groupId = groupId;
//		this.lectureId = lectureId;
		this.qTranscript = qTranscript;
		this.aTranscript = aTranscript;
		this.likes = likes;
		this.timestamp = timestamp;
		this.qAudioLen = qAudioLen;
		this.aAudioLen = aAudioLen;
	}




	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

//	public String getCourseId() {
//		return courseId;
//	}
//
//	public void setCourseId(String courseId) {
//		this.courseId = courseId;
//	}
//
//	public String getGroupId() {
//		return groupId;
//	}
//
//	public void setGroupId(String groupId) {
//		this.groupId = groupId;
//	}
//
//	public String getLectureId() {
//		return lectureId;
//	}
//
//	public void setLectureId(String lectureId) {
//		this.lectureId = lectureId;
//	}

	public String getQtranscript() {
		return qTranscript;
	}

	public void setQtranscript(String qTranscript) {
		this.qTranscript = qTranscript;
	}

	public String getAtranscript() {
		return aTranscript;
	}

	public void setAtranscript(String aTranscript) {
		this.aTranscript = aTranscript;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CreationTimestamp")
	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}


	public float getqAudioLen() {
		return qAudioLen;
	}


	public void setqAudioLen(float qAudioLen) {
		this.qAudioLen = qAudioLen;
	}


	public float getaAudioLen() {
		return aAudioLen;
	}


	public void setaAudioLen(float aAudioLen) {
		this.aAudioLen = aAudioLen;
	}

    public String getqTranscript() {
		return qTranscript;
	}


	public void setqTranscript(String qTranscript) {
		this.qTranscript = qTranscript;
	}


	public String getaTranscript() {
		return aTranscript;
	}


	public void setaTranscript(String aTranscript) {
		this.aTranscript = aTranscript;
	}


	public LectureEntity getLecture() {
		return lecture;
	}


	public void setLecture(LectureEntity lecture) {
		this.lecture = lecture;
	}

	@Override
	public String toString() {
		return "QuestionAnswerEntity [id=" + id + ", qTranscript=" + qTranscript + ", aTranscript=" + aTranscript + ", likes=" + likes
				+ ", timestamp=" + timestamp + ", qAudioLen=" + qAudioLen + ", aAudioLen=" + aAudioLen + ", lecture="
				+ lecture + "]";
	}


    
    
}
