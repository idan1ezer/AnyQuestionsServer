package anyQuestions.data.converters;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import anyQuestions.boundaries.CourseBoundary;
import anyQuestions.boundaries.GroupBoundary;
import anyQuestions.data.CourseEntity;
import anyQuestions.data.GroupEntity;


@Component
public class CourseConverter {
	
	public CourseEntity toEntity(CourseBoundary boundary) {
		CourseEntity entity = new CourseEntity();
		
		entity.setName(boundary.getName());
		/*
		 * GroupEntity[] entities = new GroupEntity[boundary.getGroups().length];
		 * GroupConverter converter = new GroupConverter(); for(int i=0;
		 * i<entities.length; i++) { entities[i] =
		 * converter.toEntity(boundary.getGroups()[i]); } entity.setGroups(entities);
		 */
		/*
		 * UserConverter uconverter = new UserConverter(); UserEntity[] uentities = new
		 * UserEntity[boundary.getUsers().length]; for(int i=0; i<uentities.length; i++)
		 * { uentities[i] = uconverter.toEntity(boundary.getUsers()[i]); }
		 * entity.setUsers(uentities);
		 */
		return entity;
	}
	
	public CourseBoundary toBoundary(CourseEntity entity) {
		CourseBoundary boundary = new CourseBoundary();
		
		boundary.setName(entity.getName());
		List<GroupBoundary>groupsBoundaries = new ArrayList<>();
		GroupConverter converter = new GroupConverter();
		for(int i=0; i<entity.getGroups().size();i++) {
			groupsBoundaries.add(converter.toBoundary(entity.getGroups().get(i)));
		}
		boundary.setGroups(groupsBoundaries);

		return boundary;
	}
}
