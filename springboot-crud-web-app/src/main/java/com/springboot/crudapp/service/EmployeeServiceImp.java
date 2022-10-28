package com.springboot.crudapp.service;

import java.util.List;

import org.hibernate.id.enhanced.Optimizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.springboot.crudapp.model.Employee;
import com.springboot.crudapp.repositry.EmployeeRepository;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	private EmployeeRepository employeerepositry;
	// private CrudRepository<Employee, Integer> employeeRepository;
	private Integer id;

	@Override
	public List<Employee> getAllEmployees() {
		return employeerepositry.findAll();

	}

	@Override
	public void saveEmployee(Employee employee) {
		employeerepositry.save(employee);

		
	}

	@Override
	public Employee getEmployeeById(Integer Id) {
		java.util.Optional<Employee> optional = employeerepositry.findById(Id);
		Employee employee = null;
		if (optional.isPresent()) {
			employee = optional.get();
		} else {
			throw new RuntimeException(" Employee not found for Id :: " + Id);
		}
		return employee;
	}

	@Override
	public void deleteEmployeeById(Integer Id) {
		employeerepositry.deleteById(Id);
	}
}
