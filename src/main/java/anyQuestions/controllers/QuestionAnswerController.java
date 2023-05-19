package anyQuestions.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import anyQuestions.boundaries.QuestionAnswerBoundary;
import anyQuestions.services.JpaQuestionAnswerService;

@RestController
public class QuestionAnswerController {
	JpaQuestionAnswerService service;
	
	@Autowired
	public QuestionAnswerController(JpaQuestionAnswerService service) {
		this.service = service;
	}
	
	@RequestMapping(
			path="/anyQuestions/questionAnswer/addQuestions",
			method=RequestMethod.POST,
			produces=MediaType.APPLICATION_JSON_VALUE,
			consumes=MediaType.APPLICATION_JSON_VALUE)
	public QuestionAnswerBoundary createQuestion(@RequestBody QuestionAnswerBoundary  newQuestion) {
		
		return this.service.storeQuestionAnswer(newQuestion);
	}
	
	@RequestMapping(
			path = "/anyquestions/live/getQA/{lectureID}",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public QuestionAnswerBoundary[] getAllQuestions(@PathVariable("lectureID") String lectureID) {
		
		return this.service.getAllQuestions(lectureID).toArray(new QuestionAnswerBoundary[0]);
	}
}
