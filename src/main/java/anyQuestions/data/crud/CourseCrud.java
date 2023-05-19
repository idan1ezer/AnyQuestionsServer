package anyQuestions.data.crud;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import anyQuestions.data.CourseEntity;

@Repository
public interface CourseCrud extends CrudRepository<CourseEntity, String> {

	
	//@Query("SELECT c FROM CourseEntity c JOIN c.groups g JOIN g.users u WHERE u.userId = :userId")
	
//	public List<CourseEntity> findAllByUserId(@Param("userId") String userId);

    @Query("SELECT g.course FROM GroupEntity g WHERE g.id = :groupId")
    public List<CourseEntity> findCourseByGroupId(@Param("groupId") String groupId);
    
    
    @Query("SELECT g.course FROM GroupEntity g JOIN g.users u WHERE u.id = :userId")
    public List<CourseEntity> findCoursesByUserId(@Param("userId") String userId);


}

