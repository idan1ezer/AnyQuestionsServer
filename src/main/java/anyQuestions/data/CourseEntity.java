package anyQuestions.data;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import javassist.expr.NewArray;


@Entity
@Table(name = "Courses")
public class CourseEntity {
	@Id
	@Column(name = "id")
	private String id;
	@Column(name = "name", nullable = false)
    private String name;
	@OneToMany(mappedBy = "course", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<GroupEntity> groups = new ArrayList<>();
    

    
    public CourseEntity() {
    	
    }

    public CourseEntity(String id, String name) {
    	this.id = id;
    	this.name = name;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public List<GroupEntity> getGroups() {
		return groups;
	}

	public void setGroups(List<GroupEntity> groups) {
		this.groups = groups;
	}

	@Override
	public String toString() {
		return "CourseEntity [id=" + id + ", name=" + name + ", groups=" + groups + "]";
	}




}
