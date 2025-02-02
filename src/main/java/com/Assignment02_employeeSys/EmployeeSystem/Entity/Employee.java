package com.Assignment02_employeeSys.EmployeeSystem.Entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "First name is required")
    private String firstName;

    @NotBlank(message = "Last name is required")
    private String lastName;

    @NotNull(message = "Date of birth is required")
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    @NotBlank(message = "Postal code is required")
    private String postalCode;

    @NotBlank(message = "Address Line 1 is required")
    private String addressLine1;

    private String addressLine2;
    private String addressLine3;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;

    @NotBlank(message = "Mobile number is required")
    @Pattern(regexp = "^\\d{10}$", message = "Invalid mobile number format")
    private String mobile;

    private String nearestStation;



}
