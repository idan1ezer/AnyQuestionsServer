package anyQuestions.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "Lectures_Table")
public class LectureEntity {
	@Id
    @Column(name = "lecture_id")
	private long id;
	@Column(name = "is_Live", nullable = false)
    private boolean isLive;
	@Column(name = "timestamp", nullable = true)
    private Date timestamp;
	@Column(name = "lecture_Number", nullable = false)
    private int lectureNumber;
    
    @ManyToOne
    @JoinColumn(name = "group_id")
    private GroupEntity group;
    
    @OneToMany(mappedBy = "lecture")
    private List<QuestionAnswerEntity> questions = new ArrayList<>();

    public LectureEntity() {
    	
    }
    

    public LectureEntity(long id, boolean isLive, Date timestamp, int lectureNumber) {
		super();
		this.id = id;
		this.isLive = isLive;
		this.timestamp = timestamp;
		this.lectureNumber = lectureNumber;
	}


	public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean getIsLive() {
        return isLive;
    }

    public void setIsLive(boolean live) {
        isLive = live;
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

	public GroupEntity getGroup() {
		return group;
	}

	public void setGroup(GroupEntity group) {
		this.group = group;
	}

	public List<QuestionAnswerEntity> getQuestions() {
		return questions;
	}

	public void setQuestions(List<QuestionAnswerEntity> questions) {
		this.questions = questions;
	}
	



	 @Override
		public String toString() {
			return "LectureEntity [id=" + id + ", isLive=" + isLive + ", timestamp=" + timestamp + ", lectureNumber="
					+ lectureNumber + ", group=" + group + ", questions=" + questions + "]";
		}


}