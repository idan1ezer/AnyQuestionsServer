package anyQuestions;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import anyQuestions.data.CourseEntity;
import anyQuestions.data.GroupEntity;
import anyQuestions.data.LectureEntity;
import anyQuestions.data.QuestionAnswerEntity;
import anyQuestions.data.UserEntity;
import anyQuestions.data.crud.CourseCrud;
import anyQuestions.data.crud.GroupCrud;
import anyQuestions.data.crud.LectureCrud;
import anyQuestions.data.crud.QuestionAnswerCrud;
import anyQuestions.data.crud.UserCrud;

@SpringBootApplication
public class AnyQuestionsApplication {

	public static void main(String[] args) {
	    ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(AnyQuestionsApplication.class, args);

	    UserCrud ucrud = configurableApplicationContext.getBean(UserCrud.class);
	    GroupCrud gcrud = configurableApplicationContext.getBean(GroupCrud.class);
	    CourseCrud ccrud = configurableApplicationContext.getBean(CourseCrud.class);
	    LectureCrud lcrud = configurableApplicationContext.getBean(LectureCrud.class);
	    QuestionAnswerCrud qcrud = configurableApplicationContext.getBean(QuestionAnswerCrud.class);
	    
	    QuestionAnswerEntity q1 = new QuestionAnswerEntity("11111101QA1", "What is Infinitesimal Math??", "Infinitesimal Math is a branch of mathematics that deals with infinitesimal quantities.", 5, null, 1);
	    QuestionAnswerEntity q2 = new QuestionAnswerEntity("11111101QA2", "What is an infinitesimal?", "An infinitesimal is a quantity that is extremely small, but not zero.", 4, null, 2);
	    QuestionAnswerEntity q3 = new QuestionAnswerEntity("11111102QA1", "Who is considered the father of Infinitesimal Math?", "The father of Infinitesimal Math is considered to be the German mathematician Gottfried Wilhelm Leibniz.", 3, null, 3);
	    QuestionAnswerEntity q4 = new QuestionAnswerEntity("11111103QA1", "What is the concept of infinitesimal calculus?", "The concept of infinitesimal calculus involves using infinitesimals to calculate the behavior of functions and curves.", 2, null, 4);
	    QuestionAnswerEntity q5 = new QuestionAnswerEntity("11111103QA2", "How is Infinitesimal Math different from traditional calculus?", "Infinitesimal Math is different from traditional calculus in that it relies on the use of infinitesimals rather than limits.", 1, null, 5);
	    QuestionAnswerEntity q6 = new QuestionAnswerEntity("11111103QA3", "What is the controversy surrounding the use of infinitesimals in math?", "The controversy surrounding the use of infinitesimals in math stems from their lack of rigor and formal definition.", 5, null, 1);
	    QuestionAnswerEntity q7 = new QuestionAnswerEntity("11112201QA1", "How did mathematicians resolve the controversy over infinitesimals?", "How did mathematicians resolve the controversy over infinitesimals?", 4, null, 2);
//	    QuestionAnswerEntity q8 = new QuestionAnswerEntity("11112202QA1", "What is a hyperreal number?", "A hyperreal number is a number that is larger than any real number but smaller than infinity.", 3, null, 3, 3);
//	    QuestionAnswerEntity q9 = new QuestionAnswerEntity("11112202QA2", "How are hyperreal numbers used in Infinitesimal Math?", "Hyperreal numbers are used in Infinitesimal Math to provide a rigorous foundation for the use of infinitesimals.", 2, null, 4, 4);
//	    QuestionAnswerEntity q10 = new QuestionAnswerEntity("11112203QA1", "What is the transfer principle?", "The transfer principle is a key principle of non-standard analysis that allows statements about infinitesimals to be transferred to statements about real numbers.", 1, null, 5, 5);
//	    QuestionAnswerEntity q11 = new QuestionAnswerEntity("11112203QA2", "What is the standard part function?", "The standard part function is a function used in non-standard analysis to convert a hyperreal number into a real number.", 5, null, 1, 1);
//	    QuestionAnswerEntity q12 = new QuestionAnswerEntity("11112203QA3", "What is the principle of microcancellation?", "The principle of microcancellation is a key principle of Infinitesimal Math that allows for certain operations involving infinitesimals to be performed without introducing error.", 4, null, 2, 2);
//	    QuestionAnswerEntity q13 = new QuestionAnswerEntity("11112204QA1", "What is Infinitesimal Math??", "Infinitesimal Math is a branch of mathematics that deals with infinitesimal quantities.", 5, null, 1, 1);
//	    QuestionAnswerEntity q14 = new QuestionAnswerEntity("11112204QA2", "What is an infinitesimal?", "An infinitesimal is a quantity that is extremely small, but not zero.", 4, null, 2, 2);
//	    QuestionAnswerEntity q15 = new QuestionAnswerEntity("11112204QA3", "Who is considered the father of Infinitesimal Math?", "The father of Infinitesimal Math is considered to be the German mathematician Gottfried Wilhelm Leibniz.", 3, null, 3, 3);
//	    QuestionAnswerEntity q16 = new QuestionAnswerEntity("11112204QA4", "What is the concept of infinitesimal calculus?", "The concept of infinitesimal calculus involves using infinitesimals to calculate the behavior of functions and curves.", 2, null, 4, 4);
//	    QuestionAnswerEntity q17 = new QuestionAnswerEntity("11113301QA1", "How is Infinitesimal Math different from traditional calculus?", "Infinitesimal Math is different from traditional calculus in that it relies on the use of infinitesimals rather than limits.", 1, null, 5, 5);
//	    QuestionAnswerEntity q18 = new QuestionAnswerEntity("11113301QA2", "What is the controversy surrounding the use of infinitesimals in math?", "The controversy surrounding the use of infinitesimals in math stems from their lack of rigor and formal definition.", 5, null, 1, 1);
//	    QuestionAnswerEntity q19 = new QuestionAnswerEntity("11113302QA1", "How did mathematicians resolve the controversy over infinitesimals?", "How did mathematicians resolve the controversy over infinitesimals?", 4, null, 2, 2);
//	    QuestionAnswerEntity q20 = new QuestionAnswerEntity("22221101QA1", "What is a hyperreal number?", "A hyperreal number is a number that is larger than any real number but smaller than infinity.", 3, null, 3, 3);
//	    QuestionAnswerEntity q21 = new QuestionAnswerEntity("22221101QA2", "How are hyperreal numbers used in Infinitesimal Math?", "Hyperreal numbers are used in Infinitesimal Math to provide a rigorous foundation for the use of infinitesimals.", 2, null, 4, 4);
//	    QuestionAnswerEntity q22 = new QuestionAnswerEntity("22221102QA1", "What is the transfer principle?", "The transfer principle is a key principle of non-standard analysis that allows statements about infinitesimals to be transferred to statements about real numbers.", 1, null, 5, 5);
//	    QuestionAnswerEntity q23 = new QuestionAnswerEntity("22221102QA2", "What is the standard part function?", "The standard part function is a function used in non-standard analysis to convert a hyperreal number into a real number.", 5, null, 1, 1);
//	    QuestionAnswerEntity q24 = new QuestionAnswerEntity("22221102QA3", "What is the principle of microcancellation?", "The principle of microcancellation is a key principle of Infinitesimal Math that allows for certain operations involving infinitesimals to be performed without introducing error.", 4, null, 2, 2);
//	    QuestionAnswerEntity q25 = new QuestionAnswerEntity("22221103QA1", "What is the transfer principle?", "The transfer principle is a key principle of non-standard analysis that allows statements about infinitesimals to be transferred to statements about real numbers.", 1, null, 5, 5);
//	    QuestionAnswerEntity q26 = new QuestionAnswerEntity("22221103QA2", "What is the standard part function?", "The standard part function is a function used in non-standard analysis to convert a hyperreal number into a real number.", 5, null, 1, 1);
//	    QuestionAnswerEntity q27 = new QuestionAnswerEntity("33331101QA1", "What is the principle of microcancellation?", "The principle of microcancellation is a key principle of Infinitesimal Math that allows for certain operations involving infinitesimals to be performed without introducing error.", 4, null, 2, 2);
//	    QuestionAnswerEntity q28 = new QuestionAnswerEntity("33331102QA1", "What is Infinitesimal Math??", "Infinitesimal Math is a branch of mathematics that deals with infinitesimal quantities.", 5, null, 1, 1);
//	    QuestionAnswerEntity q29 = new QuestionAnswerEntity("33331102QA2", "What is an infinitesimal?", "An infinitesimal is a quantity that is extremely small, but not zero.", 4, null, 2, 2);
//	    QuestionAnswerEntity q30 = new QuestionAnswerEntity("33331102QA3", "Who is considered the father of Infinitesimal Math?", "The father of Infinitesimal Math is considered to be the German mathematician Gottfried Wilhelm Leibniz.", 3, null, 3, 3);
//	    QuestionAnswerEntity q31 = new QuestionAnswerEntity("33332201QA1", "What is the concept of infinitesimal calculus?", "The concept of infinitesimal calculus involves using infinitesimals to calculate the behavior of functions and curves.", 2, null, 4, 4);
//	    QuestionAnswerEntity q32 = new QuestionAnswerEntity("33332201QA2", "How is Infinitesimal Math different from traditional calculus?", "Infinitesimal Math is different from traditional calculus in that it relies on the use of infinitesimals rather than limits.", 1, null, 5, 5);
//	    QuestionAnswerEntity q33 = new QuestionAnswerEntity("33332201QA3", "What is the controversy surrounding the use of infinitesimals in math?", "The controversy surrounding the use of infinitesimals in math stems from their lack of rigor and formal definition.", 5, null, 1, 1);
//	    QuestionAnswerEntity q34 = new QuestionAnswerEntity("33333301QA1", "How did mathematicians resolve the controversy over infinitesimals?", "How did mathematicians resolve the controversy over infinitesimals?", 4, null, 2, 2);
//	    QuestionAnswerEntity q35 = new QuestionAnswerEntity("33333301QA2", "What is a hyperreal number?", "A hyperreal number is a number that is larger than any real number but smaller than infinity.", 3, null, 3, 3);
//	    QuestionAnswerEntity q36 = new QuestionAnswerEntity("33333302QA1", "How are hyperreal numbers used in Infinitesimal Math?", "Hyperreal numbers are used in Infinitesimal Math to provide a rigorous foundation for the use of infinitesimals.", 2, null, 4, 4);
//	    QuestionAnswerEntity q37 = new QuestionAnswerEntity("33333302QA2", "What is the transfer principle?", "The transfer principle is a key principle of non-standard analysis that allows statements about infinitesimals to be transferred to statements about real numbers.", 1, null, 5, 5);
	    List<QuestionAnswerEntity>qL1 = Arrays.asList(q1,q2);
	    List<QuestionAnswerEntity>qL2 = Arrays.asList(q3);
	    List<QuestionAnswerEntity>qL3 = Arrays.asList(q4,q5,q6);
	    List<QuestionAnswerEntity>qL4 = Arrays.asList(q7);
//	    List<QuestionAnswerEntity>qL5 = Arrays.asList(q8,q9);
//	    List<QuestionAnswerEntity>qL6 = Arrays.asList(q10,q11,q12);
//	    List<QuestionAnswerEntity>qL7 = Arrays.asList(q13,q14,q15,q16);
//	    List<QuestionAnswerEntity>qL8 = Arrays.asList(q17,q18);
//	    List<QuestionAnswerEntity>qL9 = Arrays.asList(q19);
//	    List<QuestionAnswerEntity>qL10 = Arrays.asList(q20,q21);
//	    List<QuestionAnswerEntity>qL11 = Arrays.asList(q22,q23,q24);
//	    List<QuestionAnswerEntity>qL12 = Arrays.asList(q25,q26);
//	    List<QuestionAnswerEntity>qL13 = Arrays.asList(q27);
//	    List<QuestionAnswerEntity>qL14 = Arrays.asList(q28,q29,q30);
//	    List<QuestionAnswerEntity>qL15 = Arrays.asList(q31,q32,q33);
//	    List<QuestionAnswerEntity>qL16 = Arrays.asList(q34,q35);
//	    List<QuestionAnswerEntity>qL17 = Arrays.asList(q36,q37);
//	    List<QuestionAnswerEntity>questions = Arrays.asList(q1,q2,q3,q4,q5,q6,q7,q7,q8,q10,q11,q12,q13,q14,q15,q16,q17,q18,q19,q20,q21,q22,q23,q24,q25,q26,q27,q28,q29,q30,q31,q32,q33,q34,q35,q36,q37);
	    List<QuestionAnswerEntity>questions = Arrays.asList(q1,q2,q3,q4,q5,q6,q7);
	    qcrud.saveAll(questions);
	    
	
	    
	    // save users first
	    UserEntity u1 = new UserEntity("SarahJohnson87","SarahJohnson","87","LECTURER");
	    UserEntity u2 = new UserEntity("MarkLee62","MarkLee","62","LECTURER");
	    UserEntity u3 = new UserEntity("RachelGomez55","RachelGomez","55","LECTURER");
	    UserEntity u4 = new UserEntity("EmilyChen42","EmilyChen","42","LECTURER");
	    UserEntity u5 = new UserEntity("DavidKim46","DavidKim","46","LECTURER");
//	    UserEntity u6 = new UserEntity("MichaelPatel19","MichaelPatel","19","LECTURER");
//	    UserEntity u7 = new UserEntity("JohnSmith76","JohnSmith","76","STUDENT");
//	    UserEntity u8 = new UserEntity("EmilyJones43","EmilyJones","43","STUDENT");
//	    UserEntity u9 = new UserEntity("DavidLee90","DavidLee","90","STUDENT");
//	    UserEntity u10 = new UserEntity("SarahNguyen79","SarahNguyen","79","STUDENT");
//	    UserEntity u11 = new UserEntity("MichaelBrown62","MichaelBrown","62","STUDENT");
//	    UserEntity u12 = new UserEntity("RachelGarcia04","RachelGarcia","04","STUDENT");
//	    UserEntity u13 = new UserEntity("DanielKim12","DanielKim","12","STUDENT");
//	    UserEntity u14 = new UserEntity("AnnaChen18","AnnaChen","18","STUDENT");
//	    UserEntity u15 = new UserEntity("JosephDavis96","JosephDavis","96","STUDENT");
//	    UserEntity u16 = new UserEntity("SamanthaNg24","SamanthaNg","24","STUDENT");
//	    UserEntity u17 = new UserEntity("KevinSmith38","KevinSmith","38","STUDENT");
//	    UserEntity u18 = new UserEntity("LauraLee56","LauraLee","56","STUDENT");
//	    UserEntity u19 = new UserEntity("TylerNguyen22","TylerNguyen","22","STUDENT");
//	    UserEntity u20 = new UserEntity("MeganKim97","MeganKim","97","STUDENT");
//	    UserEntity u21 = new UserEntity("JasonGarcia73","JasonGarcia","73","STUDENT");
	    
	    List<UserEntity> users = Arrays.asList(u1,u2,u3,u4,u5);
//	    List<UserEntity> users = Arrays.asList(u1,u2,u3,u4,u5,u6,u7,u8,u9,u10,u11,u12,u13,u14,u15,u16,u17,u18,u19,u20,u21);

	    // save courses next
	    CourseEntity c1 = new CourseEntity("1111", "Infinitesimal Math");
	    CourseEntity c2 = new CourseEntity("2222", "Object Oriented Programming");
	    //CourseEntity c3 = new CourseEntity("3333", "Python Developing");
	   // List<CourseEntity> courses = Arrays.asList(c1,c2,c3);
	    List<CourseEntity> courses = Arrays.asList(c1,c2);
	    ccrud.saveAll(courses);

	    // save groups next
	    GroupEntity g1 = new GroupEntity("111111","SarahJohnson87","1111");
	    GroupEntity g2 = new GroupEntity("111122","MarkLee62","1111");
	    GroupEntity g3 = new GroupEntity("111133","RachelGomez55","1111");
	    GroupEntity g4 = new GroupEntity("222211","EmilyChen42","2222");
//	    GroupEntity g5 = new GroupEntity("333311","DavidKim46","3333");
//	    GroupEntity g6 = new GroupEntity("333322","DavidKim46","3333");
//	    GroupEntity g7 = new GroupEntity("333333","MichaelPatel19","3333");
	   // List<GroupEntity> groups = Arrays.asList(g1,g2,g3,g4,g5,g6,g7);
	    List<GroupEntity> groups = Arrays.asList(g1,g2,g3,g4);
	    gcrud.saveAll(groups);

	    // set up relationships between courses and groups, and between groups and lectures
	    List<GroupEntity> groups1 = Arrays.asList(g1,g2,g3);
	    List<GroupEntity> groups2 = Arrays.asList(g4);
	    //List<GroupEntity> groups3 = Arrays.asList(g5,g6,g7);
	    c1.setGroups(groups1);
	    c2.setGroups(groups2);
	    //c3.setGroups(groups3);
	    g1.setCourse(c1);
	    g2.setCourse(c1);
	    g3.setCourse(c1);
	    g4.setCourse(c2);
//	    g5.setCourse(c3);
//	    g6.setCourse(c3);
//	    g7.setCourse(c3);

	    LectureEntity l1 = new LectureEntity(11111101, false, null, 1);
	    LectureEntity l2 = new LectureEntity(11111102, false, null, 2);
	    LectureEntity l3 = new LectureEntity(11111103, true, null, 3);
	    LectureEntity l4 = new LectureEntity(11112201, false, null, 4);
	    LectureEntity l5 = new LectureEntity(11112202, true, null, 1);
	    LectureEntity l6 = new LectureEntity(11112203, true, null, 2);
//	    LectureEntity l7 = new LectureEntity(11112204, true, null, 3);
//	    LectureEntity l8 = new LectureEntity(11113301, false, null, 4);
//	    LectureEntity l9 = new LectureEntity(11113302, true, null, 1);
//	    LectureEntity l10 = new LectureEntity(22221101, false, null, 2);
//	    LectureEntity l11 = new LectureEntity(22221102, false, null, 3);
//	    LectureEntity l12 = new LectureEntity(22221103, true, null, 4);
//	    LectureEntity l13 = new LectureEntity(33331101, false, null, 1);
//	    LectureEntity l14 = new LectureEntity(33331102, true, null, 2);
//	    LectureEntity l15 = new LectureEntity(33332201, true, null, 3);
//	    LectureEntity l16 = new LectureEntity(33333301, false, null, 4);
//	    LectureEntity l17 = new LectureEntity(33333302, false, null, 4);

	    l1.setGroup(g1);
	    l2.setGroup(g1);
	    l3.setGroup(g1);
	    l4.setGroup(g2);
	    l5.setGroup(g2);
	    l6.setGroup(g2);
//	    l7.setGroup(g2);
//	    l8.setGroup(g3);
//	    l9.setGroup(g3);
//	    l10.setGroup(g4);
//	    l11.setGroup(g4);
//	    l12.setGroup(g4);
//	    l13.setGroup(g5);
//	    l14.setGroup(g5);
//	    l15.setGroup(g6);
//	    l16.setGroup(g7);
//	    l17.setGroup(g7);
	    l1.setQuestions(qL1);
	    l2.setQuestions(qL2);
	    l3.setQuestions(qL3);
	    l4.setQuestions(qL4);
//	    l5.setQuestions(qL5);
//	    l6.setQuestions(qL6);
//	    l7.setQuestions(qL7);
//	    l8.setQuestions(qL8);
//	    l9.setQuestions(qL9);
//	    l10.setQuestions(qL10);
//	    l11.setQuestions(qL11);
//	    l12.setQuestions(qL12);
//	    l13.setQuestions(qL13);
//	    l14.setQuestions(qL14);
//	    l15.setQuestions(qL15);
//	    l16.setQuestions(qL16);
//	    l17.setQuestions(qL17);
	    
	    q1.setLecture(l1);
	    q2.setLecture(l1);
	    q3.setLecture(l2);
	    q4.setLecture(l3);
	    q5.setLecture(l3);
	    q6.setLecture(l3);
	    q7.setLecture(l4);
//	    q8.setLecture(l5);
//	    q9.setLecture(l5);
//	    q10.setLecture(l6);
//	    q11.setLecture(l6);
//	    q12.setLecture(l6);
//	    q13.setLecture(l7);
//	    q14.setLecture(l7);
//	    q15.setLecture(l7);
//	    q16.setLecture(l7);
//	    q17.setLecture(l8);
//	    q18.setLecture(l8);
//	    q19.setLecture(l9);
//	    q20.setLecture(l10);
//	    q21.setLecture(l10);
//	    q22.setLecture(l11);
//	    q23.setLecture(l11);
//	    q24.setLecture(l11);
//	    q25.setLecture(l12);
//	    q26.setLecture(l12);
//	    q27.setLecture(l13);
//	    q28.setLecture(l14);
//	    q29.setLecture(l14);
//	    q30.setLecture(l14);
//	    q31.setLecture(l15);
//	    q32.setLecture(l15);
//	    q33.setLecture(l15);
//	    q34.setLecture(l16);
//	    q35.setLecture(l16);
//	    q36.setLecture(l17);
//	    q37.setLecture(l17);
	    List<LectureEntity> lectures = Arrays.asList(l1,l2,l3,l4,l5,l6);
	   // List<LectureEntity> lectures = Arrays.asList(l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17);
//	    g1.setLectures(Arrays.asList(l1,l2,l3));
//	    g2.setLectures(Arrays.asList(l4,l5,l6,l7));
//	    g3.setLectures(Arrays.asList(l8,l9));
//	    g4.setLectures(Arrays.asList(l10,l11,l12));
//	    g5.setLectures(Arrays.asList(l13,l14));
//	    g6.setLectures(Arrays.asList(l15));
//	    g7.setLectures(Arrays.asList(l16,l17));
	    g1.setLectures(Arrays.asList(l1));
	    g2.setLectures(Arrays.asList(l2));
	    g3.setLectures(Arrays.asList(l3));
	    g4.setLectures(Arrays.asList(l4));
//	    g5.setLectures(Arrays.asList(l5));
//	    g6.setLectures(Arrays.asList(l6));
//	    g7.setLectures(Arrays.asList(l7));
	    lcrud.saveAll(lectures);
	    

	    
	    // set up relationships between users and groups
	    u1.addGroup(g1);
	    u2.addGroup(g2);
	    u3.addGroup(g3);
	    u4.addGroup(g4);
	    u5.addGroup(g3);
//	    u6.addGroup(g6);
//	    u7.addGroup(g7);
//	    u7.addGroup(g4);
//	    u7.addGroup(g7);
//	    u8.addGroup(g1);
//	    u8.addGroup(g4);
//	    u9.addGroup(g1);
//	    u9.addGroup(g4);
//	    u10.addGroup(g1);
//	    u10.addGroup(g4);
//	    u11.addGroup(g2);
//	    u11.addGroup(g4);
//	    u12.addGroup(g2);
//	    u12.addGroup(g4);
//	    u13.addGroup(g4);
//	    u14.addGroup(g3);
//	    u14.addGroup(g5);
//	    u15.addGroup(g3);
//	    u15.addGroup(g5);
//	    u16.addGroup(g5);
//	    u17.addGroup(g6);
//	    u18.addGroup(g6);
//	    u19.addGroup(g7);
//	    u20.addGroup(g7);
//	    u21.addGroup(g7);
//	    
	   
	    ucrud.saveAll(users);
	    qcrud.saveAll(questions);

	}

}
