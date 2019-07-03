package br.edu.utfpr.autorepairshop.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.utfpr.autorepairshop.model.Employee;
import br.edu.utfpr.autorepairshop.model.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository repository;

	public Employee save(Employee employee) {
		return repository.save(employee);
	}
	
	public List<Employee> findAll(){
		return repository.findAll();
	}
}
