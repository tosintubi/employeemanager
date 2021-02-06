package org.tommot.employeemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.tommot.employeemanager.model.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Long>, CrudRepository<Employee, Long> {
}
