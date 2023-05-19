package anyQuestions.data.crud;

import org.springframework.data.repository.CrudRepository;

import anyQuestions.data.LectureEntity;

public interface LectureCrud extends CrudRepository<LectureEntity, String> {

}
