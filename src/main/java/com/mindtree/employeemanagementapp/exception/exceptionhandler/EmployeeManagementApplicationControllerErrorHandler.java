package com.mindtree.employeemanagementapp.exception.exceptionhandler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.mindtree.employeemanagementapp.controller.EmployeeController;
import com.mindtree.employeemanagementapp.dto.ResponseDTO;
import com.mindtree.employeemanagementapp.exception.serviceexception.EmployeeManagementServiceException;

@RestControllerAdvice(assignableTypes =  EmployeeController.class )
public class EmployeeManagementApplicationControllerErrorHandler {

	@ExceptionHandler(EmployeeManagementServiceException.class)
	public ResponseEntity<ResponseDTO> serviceExceptionHandler(Exception e, Throwable cause) {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST)
				.body(new ResponseDTO(e.getLocalizedMessage().toString(), false, true, null));

	}
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public final ResponseEntity<Object> requestExceptionHandler(MethodArgumentNotValidException ex,
			WebRequest request) {

		final List<FieldError> fieldErrors = ex.getBindingResult().getFieldErrors();
		List<ResponseDTO> errorResponses = new ArrayList<>();
		fieldErrors.forEach(error -> {
			ResponseDTO response = new ResponseDTO();
			response.setMessage(error.getField() + " : " + error.getDefaultMessage());
			response.setHttpStatus(HttpStatus.BAD_REQUEST);
			response.setError(true);
			errorResponses.add(response);
		});
		return new ResponseEntity<>(errorResponses, HttpStatus.BAD_REQUEST);
	}


}
