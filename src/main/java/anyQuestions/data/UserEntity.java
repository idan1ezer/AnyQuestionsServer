package anyQuestions.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "users")
public class UserEntity {

	 	@Id
	    @Column(name = "id")
	    private String userId;
	    @Column(name = "username", nullable = false)
	    private String username;
	    @Column(name = "password", nullable = false)
	    private String password;
	    @Column(name = "type", nullable = false)
	    private String type;
	    @Column(name = "active", nullable = false)
	    private boolean active;

	    @Temporal(TemporalType.TIMESTAMP)
	    @Column(name = "CreationTimestamp")
	    private Date createdTimestamp;

	    @ManyToMany
	    @JoinTable(
	            name = "groups_users",
	            joinColumns = @JoinColumn(name = "user_id",nullable = true),
	            inverseJoinColumns = @JoinColumn(name = "group_id"))
	    private List<GroupEntity> groupss = new ArrayList<>();
	
	public UserEntity() {
		
	}
	
	

	public UserEntity(String id, String username, String password, String type) {
		super();
		this.userId= id;
		this.username = username;
		this.password = password;
		this.type = type;
		this.active = true;
		setCreatedTimestamp(new Date());
	}



	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean getActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CreationTimestamp")
	public Date getCreatedTimestamp() {
		return createdTimestamp;
	}

	public void setCreatedTimestamp(Date createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}

	public List<GroupEntity> getGroups() {
		return groupss;
	}

	public void setGroups(List<GroupEntity> groups) {
		this.groupss = groups;
	}
	
	public void addGroup(GroupEntity g) {
		this.groupss.add(g);
	}

	@Override
	public String toString() {
		return "UserEntity [userId=" + userId + ", username=" + username + ", password=" + password + ", type=" + type
				+ ", active=" + active + ", createdTimestamp=" + createdTimestamp + ", groups=" + groupss + "]";
	}




	
}
