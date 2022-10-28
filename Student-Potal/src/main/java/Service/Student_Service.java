package Service;


import org.springframework.stereotype.Service;
import Model.Student_Model;
import Repository.Student_Repository;



@Service
public class Student_Service {
	

	 private final Student_Repository student_Repository;
	
	 
	 public Student_Service (Student_Repository student_Repository) {
		 this.student_Repository = student_Repository;
	 }
	
	public Student_Model registerUserModel(String regId,String password) {
		if(regId == null && password == null) {
			return null;
		} else {
			Student_Model student_Model = new Student_Model();
			student_Model.setRegId(regId);
			student_Model.setPassword(password);
			return student_Repository.save(student_Model);
		}
	}
	
	public Student_Model authenticate (String regId,String password) {
		return student_Repository.findByRegIdAndPassword(regId, password).orElse(null);
	}

}

