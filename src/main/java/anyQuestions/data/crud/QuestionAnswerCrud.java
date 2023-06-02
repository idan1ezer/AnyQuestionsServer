package anyQuestions.data.crud;


import java.util.List;

import anyQuestions.data.GroupEntity;
import anyQuestions.data.LectureEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import anyQuestions.data.QuestionAnswerEntity;


@Repository
public interface QuestionAnswerCrud extends CrudRepository<QuestionAnswerEntity, String> {

	@Query("SELECT q FROM QuestionAnswerEntity q JOIN q.lecture l WHERE l.id = ?1")
	public List<QuestionAnswerEntity> findAllByLectureID(long lectureId);

	
}