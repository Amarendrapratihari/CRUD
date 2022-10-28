package Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import Model.Student_Model;

public interface Student_Repository extends JpaRepository<Student_Model, Integer> {
	
	Optional<Student_Model>findByRegIdAndPassword(String regId,String password);
	

}
