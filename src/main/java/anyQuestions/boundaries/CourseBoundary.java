package anyQuestions.boundaries;

import java.util.ArrayList;
import java.util.List;

public class CourseBoundary {
	private String id;
    private String name;
    private List<GroupBoundary> groups = new ArrayList<>();
//    private UserBoundary[] users;

//    public CourseBoundary(String id, String name, GroupBoundary[] groups) {
//        this.id = id;
//        this.name = name;
//        this.groups = groups;
//    }
//    
    public CourseBoundary() {
    	
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

	public List<GroupBoundary> getGroups() {
		return groups;
	}

	public void setGroups(List<GroupBoundary> groups) {
		this.groups = groups;
	}

	@Override
	public String toString() {
		return "CourseBoundary [id=" + id + ", name=" + name + ", groups=" + groups + "]";
	}
	

//    public GroupBoundary[] getGroups() {
//        return groups;
//    }
//
//    public void setGroups(GroupBoundary[] groups) {
//        this.groups = groups;
//    }
//
//    public UserBoundary[] getUsers() {
//        return users;
//    }
//
//    public void setUsers(UserBoundary[] users) {
//        this.users = users;
   
    

}
