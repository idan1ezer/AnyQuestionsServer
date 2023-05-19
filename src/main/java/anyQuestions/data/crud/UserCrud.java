package anyQuestions.data.crud;


import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import anyQuestions.data.UserEntity;

@Repository
public interface UserCrud extends CrudRepository<UserEntity, String> {


}
