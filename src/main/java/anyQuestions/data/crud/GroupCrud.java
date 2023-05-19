package anyQuestions.data.crud;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import anyQuestions.data.GroupEntity;

@Repository
public interface GroupCrud extends CrudRepository<GroupEntity, String> {

	@Query("SELECT g FROM GroupEntity g JOIN g.users u WHERE u.userId = ?1")
	public List<GroupEntity> findAllByUserId(String userId);
	
	//public List<GroupEntity> findByCourseId(String courseId);
	
}