package com.Assignment02_employeeSys.EmployeeSystem.DTO;


import com.Assignment02_employeeSys.EmployeeSystem.Entity.Employee;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class EmployeeResponseDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String postalCode;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String email;
    private String mobile;
    private String nearestStation;

    // Constructor
    public EmployeeResponseDTO(Employee employee) {
        this.id = employee.getId();
        this.firstName = employee.getFirstName();
        this.lastName = employee.getLastName();
        this.dateOfBirth = employee.getDateOfBirth();
        this.postalCode = employee.getPostalCode();
        this.addressLine1 = employee.getAddressLine1();
        this.addressLine2 = employee.getAddressLine2();
        this.addressLine3 = employee.getAddressLine3();
        this.email = employee.getEmail();
        this.mobile = employee.getMobile();
        this.nearestStation = employee.getNearestStation();
    }



}
