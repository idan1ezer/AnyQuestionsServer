package anyQuestions.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import anyQuestions.boundaries.CourseBoundary;

import anyQuestions.services.JpaCourseService;


@RestController
public class CourseController {
	
	private JpaCourseService service;
	
	@Autowired
	public CourseController(JpaCourseService service) {
		this.service = service;
	}
	
	
	@RequestMapping(
			path="/anyQuestions/courses/{userId}",
			method=RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public CourseBoundary[] getAllCourses (@PathVariable("userId") String userId) {
		return this.service.findAllCoursesByUserId(userId).toArray(new CourseBoundary[0]);
	}
	
//	@GetMapping("/anyQuestions/courses/{courseId}/groups")
//	public ResponseEntity<List<GroupBoundary>> getChildrenForParent(@PathVariable Long parentId) {
//	    Parent parent = entityManager.find(Parent.class, parentId);
}
