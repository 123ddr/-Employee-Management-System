package com.Assignment02_employeeSys.EmployeeSystem.Service;


import com.Assignment02_employeeSys.EmployeeSystem.DTO.EmployeeResponseDTO;
import com.Assignment02_employeeSys.EmployeeSystem.Entity.Employee;
import com.Assignment02_employeeSys.EmployeeSystem.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmployeeRepository repository;

    @Override
    public EmployeeResponseDTO createEmployee(Employee employee) {

        Employee createdEmployee = repository.save(employee);

        return new EmployeeResponseDTO(createdEmployee);
    }

    @Override
    public List<EmployeeResponseDTO> getAllEmployees() {

        List<Employee> employees = repository.findAll();

        return employees.stream()
                .map(EmployeeResponseDTO::new)
                .collect(Collectors.toList());
    }

    @Override
    public EmployeeResponseDTO getEmployeeById(Long id) {

        Employee employee = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with id " + id));

        return new EmployeeResponseDTO(employee);
    }

    @Override
    public EmployeeResponseDTO updateEmployee(Long id, Employee employeeDetails) {

        Employee existingEmployee = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with id " + id));


        existingEmployee.setFirstName(employeeDetails.getFirstName());
        existingEmployee.setLastName(employeeDetails.getLastName());
        existingEmployee.setDateOfBirth(employeeDetails.getDateOfBirth());
        existingEmployee.setPostalCode(employeeDetails.getPostalCode());
        existingEmployee.setAddressLine1(employeeDetails.getAddressLine1());
        existingEmployee.setAddressLine2(employeeDetails.getAddressLine2());
        existingEmployee.setAddressLine3(employeeDetails.getAddressLine3());
        existingEmployee.setEmail(employeeDetails.getEmail());
        existingEmployee.setMobile(employeeDetails.getMobile());
        existingEmployee.setNearestStation(employeeDetails.getNearestStation());


        Employee updatedEmployee = repository.save(existingEmployee);


        return new EmployeeResponseDTO(updatedEmployee);
    }

    @Override
    public void deleteEmployee(Long id) {

        repository.deleteById(id);
    }
}
