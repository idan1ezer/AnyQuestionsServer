package anyQuestions.logic;

import java.util.List;

import anyQuestions.boundaries.GroupBoundary;


public interface GroupService {

	public List<GroupBoundary> findAllGroupsByUserId(String userId);
	//public List<GroupBoundary> findAllGroupsByCourseId(String courseId);
}
