/**
 * 
 */
package com.mindtree.employeemanagementapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.employeemanagementapp.entity.Employee;

/**
 * @author M1027358
 *
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
