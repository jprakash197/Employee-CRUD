package com.mindtree.employeemanagementapp.service;

import java.util.List;

import javax.validation.Valid;

import com.mindtree.employeemanagementapp.dto.EmployeeDTO;
import com.mindtree.employeemanagementapp.dto.EmployeeWithoutIdDTO;


public interface EmployeeService {

	List<EmployeeDTO> getAllEmployees();

	EmployeeDTO getEmployeeById(int id);

	EmployeeDTO addANewEmployee(@Valid EmployeeDTO employeeDTO);

	boolean deleteEmployeeById(@Valid int id);

	EmployeeDTO updatedEmployeeById(@Valid int id, EmployeeWithoutIdDTO employeeWithoutIdDTO);

}
