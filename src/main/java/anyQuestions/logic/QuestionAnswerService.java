package anyQuestions.logic;

import java.util.List;

import anyQuestions.boundaries.QuestionAnswerBoundary;

public interface QuestionAnswerService {

	//public QuestionAnswerBoundary getNewQuestion();
	public QuestionAnswerBoundary storeQuestionAnswer(QuestionAnswerBoundary newQuestion);
	
	public List<QuestionAnswerBoundary> getAllQuestions(long lectureID);
	
}
