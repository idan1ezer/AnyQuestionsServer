package anyQuestions.data.crud;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import anyQuestions.data.QuestionAnswerEntity;


@Repository
public interface QuestionAnswerCrud extends CrudRepository<QuestionAnswerEntity, String> {

	@Query(value = "SELECT * FROM QUESTIONS_TABLE q WHERE q.lecture_Id ILIKE %:lectureId%", nativeQuery = true)
	public List<QuestionAnswerEntity> findAllByLectureID(@Param("lectureId") String lectureId);
	
}

