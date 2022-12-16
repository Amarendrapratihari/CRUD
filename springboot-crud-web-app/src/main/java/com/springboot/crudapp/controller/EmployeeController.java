package com.springboot.crudapp.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.crudapp.model.Employee;
import com.springboot.crudapp.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	// display list of Employee
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("listEmployees", employeeService.getAllEmployees());
		return "index";

	}

	@GetMapping("/showNewEmployeeform")
	public String showNewEmployeeform(Model model) {
		System.out.println("Inside method- GET");
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "new_employee";

	}

	
	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {

		// Save Employee To Database!!!!!!
		employeeService.saveEmployee(employee);
		return "redirect:/";

	}
	
	

	@GetMapping("/showFormForUpdate/{Id}")
	public String showFormForUpdate(@PathVariable(value = "Id") Integer Id, Model model) {

		Employee employee = employeeService.getEmployeeById(Id);

		model.addAttribute("employee", employee);
		return "update_employee";
	}

	@GetMapping("/deleteEmployee/{Id}")
	public String deleteEmployee(@PathVariable(value = "Id") Integer Id) {
		employeeService.deleteEmployeeById(Id);
		return "redirect:/";

	}

}
