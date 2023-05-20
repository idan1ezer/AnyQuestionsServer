package anyQuestions.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import org.hibernate.annotations.IndexColumn;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "Groups")
public class GroupEntity {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "lecturer_id", nullable = false)
    private String lecturerId;

    @Column(name = "course_id", nullable = false)
    private String courseId;

    @ManyToOne
    @JoinColumn(name = "course_id", insertable = false, updatable = false)
    private CourseEntity course;

    @ManyToMany(mappedBy = "groups")
    private List<UserEntity> users = new ArrayList<>();
    
    @OneToMany(mappedBy = "group")
    private List<LectureEntity> lectures = new ArrayList<>();

    public GroupEntity() {}

    public GroupEntity(String id, String lecturerId, String courseId) {
        this.id = id;
        this.lecturerId = lecturerId;
        this.courseId = courseId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLecturerId() {
        return lecturerId;
    }

    public void setLecturerId(String lecturerId) {
        this.lecturerId = lecturerId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public CourseEntity getCourse() {
        return course;
    }

    public void setCourse(CourseEntity course) {
        this.course = course;
    }

    public List<UserEntity> getUsers() {
        return users;
    }

    public void setUsers(List<UserEntity> users) {
        this.users = users;
    }
    
    public List<LectureEntity> getLectures() {
        return lectures;
    }

    public void setLectures(List<LectureEntity> lectures) {
        this.lectures = lectures;
    }

    @Override
    public String toString() {
        return "GroupEntity [id=" + id + ", lecturerId=" + lecturerId + ", courseId=" + courseId + ", course=" + course
                + ", users=" + users + "]";
    }
}
