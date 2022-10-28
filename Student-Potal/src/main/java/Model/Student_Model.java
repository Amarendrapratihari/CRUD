package Model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

@Entity
@Table(name= "Student")

public class Student_Model {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	
	String RegId;
	String Password;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRegId() {
		return RegId;
	}
	public void setRegId(String regId) {
		RegId = regId;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Student_Model other = (Student_Model) obj;
		return Objects.equals(Password, other.Password) && Objects.equals(RegId, other.RegId)
				&& Objects.equals(id, other.id);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(Password, RegId, id);
	}
	
	
	@Override
	public String toString() {
		return "Student_Model [id=" + id + ", RegId=" + RegId + "]";
	}
	
	
	
	
	
	

}
