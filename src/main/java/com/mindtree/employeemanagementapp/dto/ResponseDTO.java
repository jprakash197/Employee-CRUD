package com.mindtree.employeemanagementapp.dto;

import java.io.Serializable;

/**
 * @author M1027358
 *
 */
public class ResponseDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String message;

	private boolean success;

	private boolean error;

	private Object body;
	
	private Object httpStatus;

	public ResponseDTO() {
		super();
	}

	public ResponseDTO(String message, boolean success, boolean error, Object body) {
		super();
		this.message = message;
		this.success = success;
		this.error = error;
		this.body = body;
	}

	
	public ResponseDTO(String message, boolean success, boolean error, Object body, Object httpStatus) {
		super();
		this.message = message;
		this.success = success;
		this.error = error;
		this.body = body;
		this.httpStatus = httpStatus;
	}

	public ResponseDTO(String message, Throwable cause) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public boolean isError() {
		return error;
	}

	public void setError(boolean error) {
		this.error = error;
	}

	public Object getBody() {
		return body;
	}

	public void setBody(Object body) {
		this.body = body;
	}

	public Object getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(Object httpStatus) {
		this.httpStatus = httpStatus;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((body == null) ? 0 : body.hashCode());
		result = prime * result + (error ? 1231 : 1237);
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result + (success ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResponseDTO other = (ResponseDTO) obj;
		if (body == null) {
			if (other.body != null)
				return false;
		} else if (!body.equals(other.body))
			return false;
		if (error != other.error)
			return false;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (success != other.success)
			return false;
		return true;
	}

}
