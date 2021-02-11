package org.tommot.employeemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.tommot.employeemanager.model.Employee;

import java.util.Optional;

public interface EmployeeRepository  extends JpaRepository<Employee, Long>{
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
