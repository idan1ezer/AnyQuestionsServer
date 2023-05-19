package anyQuestions.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import anyQuestions.boundaries.GroupBoundary;
import anyQuestions.services.jpaGroupService;

@RestController
public class GroupController {
	jpaGroupService service;
	
	@Autowired
	public GroupController(jpaGroupService service) {
		this.service = service;
	}
	
	@RequestMapping(
			path = "/anyquestions/getGroups/{userId}",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public GroupBoundary[] getAllGroups(@PathVariable("userId") String userId) {
		
		return this.service.findAllGroupsByUserId(userId).toArray(new GroupBoundary[0]);
	}
	
//	@RequestMapping(
//			path = "/anyquestions/getGroupss/{courseId}",
//			method = RequestMethod.GET,
//			produces = MediaType.APPLICATION_JSON_VALUE)
//    public GroupBoundary[] getAllGroupsByCourseId(@PathVariable (value = "courseId") String courseId) {
//        return this.service.findAllGroupsByCourseId(courseId).toArray(new GroupBoundary[0]);
//    }
}
