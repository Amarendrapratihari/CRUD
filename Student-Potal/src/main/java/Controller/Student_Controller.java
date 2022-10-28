package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Student_Controller {

	
	@GetMapping("/register")
	public String getRegisterStudent() {
		return "register_student";
	}
	
	@GetMapping("/login")
	public String getLoginStudent() {
		return "login_student";
	}
	
}
