package anyQuestions.data.crud;

import anyQuestions.data.GroupEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import anyQuestions.data.LectureEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LectureCrud extends CrudRepository<LectureEntity, String> {

    @Query("SELECT l FROM LectureEntity l JOIN l.group g WHERE g.id = ?1")
    public List<LectureEntity> findAllByGroupId(String groupId);
}
