package anyQuestions.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import anyQuestions.boundaries.CourseBoundary;
import anyQuestions.data.converters.CourseConverter;
import anyQuestions.data.crud.CourseCrud;
import anyQuestions.logic.CourseService;

@Service
public class JpaCourseService implements CourseService{
	
	private CourseCrud crud;
	private CourseConverter converter;

	@Autowired
	public JpaCourseService(CourseConverter converter,CourseCrud crud) {
		this.converter = converter;
		this.crud = crud;
	} 
	
	@Override
	@Transactional
	public List<CourseBoundary> findAllCoursesByUserId(String userId) {
		return this.crud.findCoursesByUserId(userId)
				.stream()
				.map(this.converter::toBoundary)
				.toList();
	}

}
