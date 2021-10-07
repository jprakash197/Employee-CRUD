package com.mindtree.employeemanagementapp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.employeemanagementapp.dto.EmployeeDTO;
import com.mindtree.employeemanagementapp.dto.EmployeeWithoutIdDTO;
import com.mindtree.employeemanagementapp.dto.ResponseDTO;
import com.mindtree.employeemanagementapp.exception.serviceexception.EmployeeManagementServiceException;
import com.mindtree.employeemanagementapp.service.EmployeeService;

@RestController
@RequestMapping("api/v1")
public class EmployeeController {

	private final EmployeeService employeeService;

	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	@GetMapping("/employees/{id}")
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.GET)
	public ResponseEntity<ResponseDTO> getEmployeeById(@PathVariable int id) {
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(new ResponseDTO("Valid API to find Emloyee by id", true,
				false, employeeService.getEmployeeById(id), "ACCEPTED"));
	}

	@GetMapping("/employees")
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.GET)
	public ResponseEntity<ResponseDTO> getAllEmployees() {
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(new ResponseDTO("Valid API to find all employees", true,
				false, employeeService.getAllEmployees(), "ACCEPTED"));
	}

	@PostMapping("/employee")
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.POST)
	public ResponseEntity<ResponseDTO> addANewEmployee(@Valid @RequestBody EmployeeDTO employeeDTO)
			throws EmployeeManagementServiceException {
		return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseDTO("Valid API to add an employee", true,
				false, employeeService.addANewEmployee(employeeDTO), "CREATED"));
	}

	@DeleteMapping("/employees/{id}")
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.POST)
	public ResponseEntity<ResponseDTO> deleteEmployeeById(@Valid @PathVariable int id)
			throws EmployeeManagementServiceException {
		return ResponseEntity.status(HttpStatus.GONE)
				.body(new ResponseDTO("Valid API to delete an employee by id", true, false,
						employeeService.deleteEmployeeById(id), "DELETED"));
	}

	@PutMapping("/employees/{id}")
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.POST)
	public ResponseEntity<ResponseDTO> updateEmployeeById(@Valid @PathVariable int id,
			@RequestBody EmployeeWithoutIdDTO employeeWithoutIdDTO) throws EmployeeManagementServiceException {
		return ResponseEntity.status(HttpStatus.ACCEPTED)
				.body(new ResponseDTO("Valid API to update an employee by id", true, false,
						employeeService.updatedEmployeeById(id, employeeWithoutIdDTO), "UPDATED"));
	}
}
