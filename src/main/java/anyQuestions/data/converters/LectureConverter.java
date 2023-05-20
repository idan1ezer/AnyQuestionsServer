package anyQuestions.data.converters;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import anyQuestions.boundaries.LectureBoundary;
import anyQuestions.boundaries.QuestionAnswerBoundary;
import anyQuestions.data.LectureEntity;

@Component
public class LectureConverter {
	
	public LectureEntity toEntity(LectureBoundary boundary) {
		LectureEntity entity = new LectureEntity();
		entity.setLectureNumber(boundary.getLectureNumber());
		entity.setPermission(boundary.getPermission());
		entity.setTimestamp(boundary.getTimestamp());
		
		return entity;
	}
	
	public LectureBoundary toBoundary(LectureEntity entity) {
		LectureBoundary boundary = new LectureBoundary();
		boundary.setId(entity.getId());
		boundary.setLectureNumber(entity.getLectureNumber());
		boundary.setPermission(entity.getPermission());
		boundary.setTimestamp(entity.getTimestamp());
		QuestionAnswerConverter converter = new QuestionAnswerConverter();
		List<QuestionAnswerBoundary>boundaries = new ArrayList<>();
		for(int i=0; i<entity.getQuestions().size(); i++) {
			boundaries.add(converter.toBoundary(entity.getQuestions().get(i)));
		}
		boundary.setSummary(boundaries);
		
		return boundary;
	}
}

