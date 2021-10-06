package com.mindtree.employeemanagementapp.exception.serviceexception;

import com.mindtree.employeemanagementapp.exception.EmployeeManagementApplicationException;

public class EmployeeManagementServiceException extends EmployeeManagementApplicationException {
	private static final long serialVersionUID = 1L;

	public EmployeeManagementServiceException() {
		super();
	}

	public EmployeeManagementServiceException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public EmployeeManagementServiceException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public EmployeeManagementServiceException(String arg0) {
		super(arg0);
	}

	public EmployeeManagementServiceException(Throwable arg0) {
		super(arg0);
	}

}
