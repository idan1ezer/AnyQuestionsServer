package anyQuestions.data.converters;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import anyQuestions.boundaries.GroupBoundary;
import anyQuestions.boundaries.LectureBoundary;
import anyQuestions.data.GroupEntity;

@Component
public class GroupConverter {

	public GroupEntity toEntity(GroupBoundary boundary) {
		GroupEntity entity = new GroupEntity();
		

		entity.setLecturerId(boundary.getLecturerID());
		entity.setCourseId(boundary.getCourseId());
		
		return entity;
	}
	
	public GroupBoundary toBoundary(GroupEntity entity) {
		GroupBoundary boundary = new GroupBoundary();
		boundary.setID(entity.getId());
		boundary.setLecturerID(entity.getLecturerId());
		boundary.setCourseId(entity.getCourseId());
		LectureConverter converter = new LectureConverter();
		List<LectureBoundary>boundaries = new ArrayList<>();
		for(int i = 0; i<entity.getLecturess().size(); i++) {
			boundaries.add(converter.toBoundary(entity.getLecturess().get(i)));
		}
		boundary.setLectures(boundaries);
		 
		return boundary;
	}
}

