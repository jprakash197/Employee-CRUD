package com.mindtree.employeemanagementapp.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.employeemanagementapp.dto.EmployeeDTO;
import com.mindtree.employeemanagementapp.dto.EmployeeWithoutIdDTO;
import com.mindtree.employeemanagementapp.entity.Employee;
import com.mindtree.employeemanagementapp.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private final EmployeeRepository employeeRepository;
	private final ModelMapper modelMapper;

	@Autowired
	public EmployeeServiceImpl(ModelMapper modelMapper, EmployeeRepository employeeRepository) {
		super();
		this.modelMapper = modelMapper;
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<EmployeeDTO> getAllEmployees() {
		return employeeRepository.findAll().stream().map(e -> modelMapper.map(e, EmployeeDTO.class))
				.collect(Collectors.toList());
	}

	@Override
	public EmployeeDTO getEmployeeById(int id) {
		return modelMapper.map(employeeRepository.findById(id).get(), EmployeeDTO.class);
	}

	@Override
	public EmployeeDTO addANewEmployee(@Valid EmployeeDTO employeeDTO) {

		Employee employee = modelMapper.map(employeeDTO, Employee.class);
		// TODO: exception handling
		employeeRepository.save(employee);
		return modelMapper.map(employee, EmployeeDTO.class);
	}

	@Override
	public boolean deleteEmployeeById(@Valid int id) {
		boolean isDeleted = false;
		employeeRepository.deleteById(id);
		isDeleted = true;

		return isDeleted;
	}

	@Override
	public EmployeeDTO updatedEmployeeById(@Valid int id, EmployeeWithoutIdDTO employeeWithoutIdDTO) {
		Employee employee=employeeRepository.findById(id).get();
		employee.setName(employeeWithoutIdDTO.getName());
		employee.setCompitency(employeeWithoutIdDTO.getCompitency());
		employee.setYearOfJoining(employeeWithoutIdDTO.getYearOfJoining());
		employeeRepository.save(employee);
		return  modelMapper.map(employee, EmployeeDTO.class);
	}

}
