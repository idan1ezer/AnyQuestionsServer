package anyQuestions.data.converters;

import org.springframework.stereotype.Component;

import anyQuestions.boundaries.QuestionAnswerBoundary;
import anyQuestions.data.QuestionAnswerEntity;

@Component
public class QuestionAnswerConverter {

	public QuestionAnswerEntity toEntity(QuestionAnswerBoundary questionAnswerBoundary) {
		QuestionAnswerEntity entity = new QuestionAnswerEntity();
	
		entity.setQtranscript(questionAnswerBoundary.getQuestion());
		entity.setAtranscript(questionAnswerBoundary.getAnswer());
//		entity.setCourseId(questionAnswerBoundary.getCourseId());
//		entity.setGroupId(questionAnswerBoundary.getGroupId());
//		entity.setLectureId(questionAnswerBoundary.getLectureId());
		entity.setLikes(questionAnswerBoundary.getLikes());
	
		
		return entity;
	}
	
	public QuestionAnswerBoundary toBoundary(QuestionAnswerEntity questionAnswerEntity) {
		QuestionAnswerBoundary boundary = new QuestionAnswerBoundary();
		
		boundary.setQuestion(questionAnswerEntity.getQtranscript());
		boundary.setAnswer(questionAnswerEntity.getAtranscript());
//		boundary.setCourseId(questionAnswerEntity.getCourseId());
//		boundary.setGroupId(questionAnswerEntity.getGroupId());
//		boundary.setLectureId(questionAnswerEntity.getLectureId());
		boundary.setLikes(questionAnswerEntity.getLikes());
		
		
		return boundary;
	}
}
