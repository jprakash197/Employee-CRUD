package com.mindtree.employeemanagementapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int id;
	private String name;
	private String compitency;
	private int yearOfJoining;

	public Employee() {
		super();
	}

	public Employee(int id, String name, String compitency, int yearOfJoining) {
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
		Employee other = (Employee) obj;
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

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", compitency=" + compitency + ", yearOfJoining="
				+ yearOfJoining + "]";
	}

}
