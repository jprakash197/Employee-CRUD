package com.mindtree.employeemanagementapp.exception;

public class EmployeeManagementApplicationException extends Exception {

	private static final long serialVersionUID = 1L;

	public EmployeeManagementApplicationException() {
		super();
	}

	public EmployeeManagementApplicationException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public EmployeeManagementApplicationException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public EmployeeManagementApplicationException(String arg0) {
		super(arg0);
	}

	public EmployeeManagementApplicationException(Throwable arg0) {
		super(arg0);
	}

}
