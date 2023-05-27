package anyQuestions.data;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "courses")
public class CourseEntity {
	@Id
	@Column(name = "id")
	private String id;
	@Column(name = "name", nullable = false)
    private String name;
	@OneToMany(mappedBy = "course", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<GroupEntity> groupsss = new ArrayList<>();
    

    
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

	public List<GroupEntity> getGroupsss() {
		return groupsss;
	}

	public void setGroupsss(List<GroupEntity> groupsss) {
		this.groupsss = groupsss;
	}

	@Override
	public String toString() {
		return "CourseEntity [id=" + id + ", name=" + name + ", groups=" + groupsss + "]";
	}




}
