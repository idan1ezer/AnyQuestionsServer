package anyQuestions.services;

import java.util.Date;
import java.util.List;


import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import anyQuestions.boundaries.QuestionAnswerBoundary;
import anyQuestions.data.QuestionAnswerEntity;
import anyQuestions.data.converters.QuestionAnswerConverter;
import anyQuestions.data.crud.QuestionAnswerCrud;
import anyQuestions.logic.QuestionAnswerService;

@Service
public class JpaQuestionAnswerService implements QuestionAnswerService{
	
	private QuestionAnswerConverter converter;
	private QuestionAnswerCrud crud;
	
	@Autowired
	public JpaQuestionAnswerService(QuestionAnswerConverter converter,QuestionAnswerCrud crud) {
		this.converter = converter;
		this.crud = crud;
	}

	@Override
	@Transactional(readOnly = true)
	public List<QuestionAnswerBoundary> getAllQuestions(String lectureID) {
		return this.crud.findAllByLectureID(lectureID)
				.stream()
				.map(this.converter::toBoundary)
				.toList();
	}

	@Override
	@Transactional
	public QuestionAnswerBoundary storeQuestionAnswer(QuestionAnswerBoundary newQuestion) {
		QuestionAnswerEntity entity = this.converter.toEntity(newQuestion);
		entity.setTimestamp(new Date());
		
		this.crud.save(entity);
		return this.converter.toBoundary(entity);
		
	}
	
}
