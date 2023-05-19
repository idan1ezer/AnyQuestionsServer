package anyQuestions.logic;

import java.util.List;

import anyQuestions.boundaries.CourseBoundary;


public interface CourseService {
	public List<CourseBoundary> findAllCoursesByUserId(String userId);
}
