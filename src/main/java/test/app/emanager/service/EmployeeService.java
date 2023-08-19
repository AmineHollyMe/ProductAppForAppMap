package test.app.emanager.service;

import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.app.emanager.exception.UserNotFoundException;
import test.app.emanager.model.Employee;
import test.app.emanager.repo.EmployeeRepo;


@Service
public class EmployeeService {
	
	private final EmployeeRepo employeerepo;
	
	
	@Autowired
	public EmployeeService(EmployeeRepo employeerepo) {
		this.employeerepo = employeerepo;
	}
	
	public Employee addEmployee(Employee employee) {
		employee.setEmployeeCode(UUID.randomUUID().toString());
		return employeerepo.save(employee);
	}

	public List<Employee> findAllE(){
		return employeerepo.findAll();
	}
	
	public Employee updateEmployee(Employee employee) {
		return employeerepo.save(employee);
	}
	
	@Transactional
	public void deleteE(Long id) {
		employeerepo.deleteEmployeeById(id);
	}
	
	public Employee findEbyId(Long id) {
		return employeerepo.findEmployeeById(id).orElseThrow(() -> new UserNotFoundException("This user doesn't exist"));
	}
	
	

}
