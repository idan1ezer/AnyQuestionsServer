package anyQuestions.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import anyQuestions.boundaries.GroupBoundary;
import anyQuestions.data.converters.GroupConverter;

import anyQuestions.data.crud.GroupCrud;

import anyQuestions.logic.GroupService;

@Service
public class JpaGroupService implements GroupService {
	private GroupCrud crud;
	private GroupConverter converter;

	@Autowired
	public JpaGroupService(GroupConverter converter, GroupCrud crud) {
		this.converter = converter;
		this.crud = crud;
	} 
	
	@Override
	@Transactional
	public List<GroupBoundary> findAllGroupsByUserId(String userId) {
		return this.crud.findAllByUserId(userId)
				.stream()
				.map(this.converter::toBoundary)
				.toList();
	}
	
//	@Override
//	@Transactional(readOnly = true)
//	public List<GroupBoundary> findAllGroupsByCourseId(String courseId) {
//		return this.crud.findByCourseId(courseId)
//				.stream()
//				.map(this.converter::toBoundary)
//				.toList();
//	}

}
