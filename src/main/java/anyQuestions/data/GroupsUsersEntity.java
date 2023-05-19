package anyQuestions.data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "GroupsUsers_Table")
public class GroupsUsersEntity {

    @EmbeddedId
    private GroupsUsersId id;

    @ManyToOne
    @MapsId("userId")
    private UserEntity user;

    @ManyToOne
    @MapsId("groupId")
    private GroupEntity group;

    public GroupsUsersEntity() {
    }

    public GroupsUsersEntity(UserEntity user, GroupEntity group) {
        this.user = user;
        this.group = group;
        this.id = new GroupsUsersId(user.getUserId(), group.getId());
    }

    public GroupsUsersId getId() {
        return id;
    }

    public void setId(GroupsUsersId id) {
        this.id = id;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public GroupEntity getGroup() {
        return group;
    }

    public void setGroup(GroupEntity group) {
        this.group = group;
    }

}
