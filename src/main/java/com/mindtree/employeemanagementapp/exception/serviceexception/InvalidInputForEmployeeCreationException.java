/**
 * 
 */
package com.mindtree.employeemanagementapp.exception.serviceexception;

/**
 * @author M1027358
 *
 */
public class InvalidInputForEmployeeCreationException extends EmployeeManagementServiceException {

	/**
	 * 
	 */
	public InvalidInputForEmployeeCreationException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 */
	public InvalidInputForEmployeeCreationException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public InvalidInputForEmployeeCreationException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 */
	public InvalidInputForEmployeeCreationException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 */
	public InvalidInputForEmployeeCreationException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

}
