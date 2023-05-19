package anyQuestions.data;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class GroupsUsersId implements Serializable {

    @Column(name = "user_id")
    private String userId;

    @Column(name = "group_id")
    private String groupId;

    public GroupsUsersId() {}

    public GroupsUsersId(String userId, String groupId) {
        this.userId = userId;
        this.groupId = groupId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    // Override equals and hashCode methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GroupsUsersId that = (GroupsUsersId) o;

        if (!userId.equals(that.userId)) return false;
        return groupId.equals(that.groupId);
    }

    @Override
    public int hashCode() {
        int result = userId.hashCode();
        result = 31 * result + groupId.hashCode();
        return result;
    }
}
