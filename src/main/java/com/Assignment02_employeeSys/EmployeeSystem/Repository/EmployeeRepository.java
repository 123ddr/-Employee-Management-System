package com.Assignment02_employeeSys.EmployeeSystem.Repository;

import com.Assignment02_employeeSys.EmployeeSystem.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;



public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
