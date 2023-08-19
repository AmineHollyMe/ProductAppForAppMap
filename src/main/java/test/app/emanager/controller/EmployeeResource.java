package test.app.emanager.controller;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import test.app.emanager.model.Employee;
import test.app.emanager.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeResource {
	private final EmployeeService employeeService;
	
	
	public EmployeeResource(EmployeeService employeeservice) {
		this.employeeService = employeeservice;
	}
	
	
	@GetMapping("/all")
	public ResponseEntity<List<Employee>> getAllE(){
		List<Employee> employees = employeeService.findAllE();
		return new ResponseEntity<>(employees, HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Employee> getE(@PathVariable("id") Long id){
		Employee employee = employeeService.findEbyId(id);
		return new ResponseEntity<>(employee, HttpStatus.OK);
	}
	
	
	@PostMapping("/add")
	public ResponseEntity<Employee> addE(@RequestBody Employee employee){
		Employee newemployee = employeeService.addEmployee(employee);
		return new ResponseEntity<>(newemployee, HttpStatus.CREATED);
		
	}
	
	
	@PutMapping("/update")
	public ResponseEntity<Employee> updateE(@RequestBody Employee employee){
		Employee newemployee = employeeService.updateEmployee(employee);
		return new ResponseEntity<>(newemployee, HttpStatus.CREATED);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> delE(@PathVariable("id") Long id){
		employeeService.deleteE(id);
		return new ResponseEntity<>(HttpStatus.OK);
		
	}
	
	

}
