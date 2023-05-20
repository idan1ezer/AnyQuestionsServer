package anyQuestions.data.converters;



import org.springframework.stereotype.Component;

import anyQuestions.boundaries.GroupBoundary;
import anyQuestions.boundaries.UserBoundary;
import anyQuestions.data.GroupEntity;
import anyQuestions.data.UserEntity;

@Component
public class UserConverter {
	
	public UserEntity toEntity(UserBoundary userBoundary) {
		UserEntity entity = new UserEntity();
		 GroupConverter converter = new GroupConverter();
//		 GroupEntity[] entities = new GroupEntity[3]; 
//		 for(int i=0; i<entities.length; i++) { 
//			 entities[i] =converter.toEntity(userBoundary.getGroups()[i]); 
//			 } 
//		 entity.setGroups(entities);

		entity.setUsername(userBoundary.getUsername());
		entity.setPassword(userBoundary.getPassword());
		entity.setType(userBoundary.getType());
		entity.setActive(userBoundary.getActive());
		//entity.setCreatedTimestamp(userBoundary.getCreatedTimestamp());
		
		return entity;
	}
	
	public UserBoundary toBoundary(UserEntity userEntity) {
		UserBoundary boundary = new UserBoundary();
		
		boundary.setUsername(userEntity.getUsername());
		boundary.setPassword(userEntity.getPassword());
		boundary.setType(userEntity.getType());
		boundary.setActive(userEntity.getActive());
		boundary.setCreatedTimestamp(userEntity.getCreatedTimestamp().toString());
		GroupConverter converter = new GroupConverter();
//		 GroupBoundary[] boundaries = new GroupBoundary[userEntity.getGroups().length]; 
//		 for(int i=0; i<boundaries.length; i++) { 
//			 boundaries[i] =converter.toBoundary(userEntity.getGroups()[i]); 
//			 } 
//		 boundary.setGroups(boundaries);
		
		return boundary;
	}
	
}
