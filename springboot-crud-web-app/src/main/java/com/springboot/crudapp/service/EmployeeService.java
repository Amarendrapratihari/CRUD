package com.springboot.crudapp.service;

import java.util.List;

import com.springboot.crudapp.model.Employee;

public interface EmployeeService {
	List<Employee>getAllEmployees();
	void saveEmployee (Employee employee);
	Employee getEmployeeById(Integer ID);
	void deleteEmployeeById(Integer Id);
	

}
