package com.Assignment02_employeeSys.EmployeeSystem.Service;


import com.Assignment02_employeeSys.EmployeeSystem.DTO.EmployeeResponseDTO;
import com.Assignment02_employeeSys.EmployeeSystem.Entity.Employee;

import java.util.List;

public interface EmpService {

    EmployeeResponseDTO createEmployee(Employee employee);
    List<EmployeeResponseDTO> getAllEmployees();
    EmployeeResponseDTO getEmployeeById(Long id);
    EmployeeResponseDTO updateEmployee(Long id, Employee employeeDetails);
    void deleteEmployee(Long id);
}
