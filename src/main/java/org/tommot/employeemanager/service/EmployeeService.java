package org.tommot.employeemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tommot.employeemanager.model.Employee;
import org.tommot.employeemanager.repository.EmployeeRepository;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee addEmployee(Employee employee ){
       employee.setEmployeeCode(UUID.randomUUID().toString());
       return employeeRepository.save(employee);
    }

    public List<Employee> findAllEmployees(){
        return employeeRepository.findAll();
    }


    public Employee updateEmployees(Employee employee) {
        // TODO: Implement validations before updating
        return employeeRepository.save(employee);
    }

    public void  deleteEmployee(Long id) {
        employeeRepository.deleteEmployeeById(id);

    }
}
