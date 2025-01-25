package com.Assignment02_employeeSys.EmployeeSystem.Service;


import com.Assignment02_employeeSys.EmployeeSystem.Entity.Employee;
import com.Assignment02_employeeSys.EmployeeSystem.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public Employee createEmployee(Employee employee) {
        return repository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with id " + id));
    }

    public Employee updateEmployee(Long id, Employee employeeDetails) {
        Employee employee = getEmployeeById(id);

        employee.setFirstName(employeeDetails.getFirstName());
        employee.setLastName(employeeDetails.getLastName());
        employee.setDateOfBirth(employeeDetails.getDateOfBirth());
        employee.setPostalCode(employeeDetails.getPostalCode());
        employee.setAddressLine1(employeeDetails.getAddressLine1());
        employee.setAddressLine2(employeeDetails.getAddressLine2());
        employee.setAddressLine3(employeeDetails.getAddressLine3());
        employee.setEmail(employeeDetails.getEmail());
        employee.setMobile(employeeDetails.getMobile());
        employee.setNearestStation(employeeDetails.getNearestStation());

        return repository.save(employee);
    }

    public void deleteEmployee(Long id) {
        repository.deleteById(id);
    }
}
