package com.mindtree.employeemanagementapp.dto;

import java.io.Serializable;


import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class EmployeeDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5014246190799653980L;
	
	@Min(value = 1, message = "Id must be a positive integer")
	@NotNull
	private int id;
	
	@Size(min = 2, message = "Name should have atleast 2 characters.")
	@NotNull
	private String name;
	
	
	@NotNull
	private String compitency;
	
	@Min(value = 2015, message = "Year must be greater than 2015")
	@Max(value =2050, message = "Must enter a valid Year")
	@NotNull
	private int yearOfJoining;
	
	public EmployeeDTO() {
	}

	public EmployeeDTO(@Min(value = 1, message = "Id must be a positive integer") @NotNull int id,
			@Size(min = 2, message = "Name should have atleast 2 characters.") @NotNull String name,
			@NotNull String compitency,
			@Min(value = 2015, message = "Year must be greater than 2015") @Max(value = 2050, message = "Must enter a valid Year") @NotNull int yearOfJoining) {
		super();
		this.id = id;
		this.name = name;
		this.compitency = compitency;
		this.yearOfJoining = yearOfJoining;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompitency() {
		return compitency;
	}

	public void setCompitency(String compitency) {
		this.compitency = compitency;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((compitency == null) ? 0 : compitency.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + yearOfJoining;
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
		EmployeeDTO other = (EmployeeDTO) obj;
		if (compitency == null) {
			if (other.compitency != null)
				return false;
		} else if (!compitency.equals(other.compitency))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (yearOfJoining != other.yearOfJoining)
			return false;
		return true;
	}
	
	

	
}
