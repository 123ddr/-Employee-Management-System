# Employee Management System

## Objective
This project is a simple **Employee Management System** built using **Spring Boot** and **MySQL**. The system includes the following CRUD functionalities:

1. **Create Employee**
2. **Get All Employees**
3. **Get Employee by employeeId**
4. **Edit Employee**
5. **Delete Employee**

Additionally, the system handles exception management and validates user inputs.

---

## Features

1. **CRUD Operations**:
   - Create new employees.
   - Retrieve all employees.
   - Retrieve an employee by their unique ID.
   - Update employee details.
   - Delete an employee.

2. **Validation**:
   - Validates fields like email, mobile number, etc.

3. **Exception Handling**:
   - Handles errors such as "Employee Not Found" and returns meaningful error messages with proper HTTP status codes.

---

## Technologies Used

1. **Backend**:
   - Spring Boot
   - Spring Data JPA

2. **Database**:
   - MySQL

3. **Tools**:
   - Maven for build and dependency management
   - Postman for API testing

---

## How to Run the Project

1. **Clone the Repository**:
   ```bash
   git clone <repository-url>
   cd employee-management-system
   ```

2. **Configure the Database**:
   - Ensure MySQL is running.
   - Create a database named `employee_db`:
     ```sql
     CREATE DATABASE employee_db;
     ```

3. **Build the Project**:
   ```bash
   mvn clean install
   ```

4. **Run the Application**:
   ```bash
   mvn spring-boot:run
   ```

5. **Test the API**:
   - Use Postman or Swagger to test the endpoints:
     - `POST /api/employees` - Create a new employee
     - `GET /api/employees` - Retrieve all employees
     - `GET /api/employees/{id}` - Retrieve a specific employee
     - `PUT /api/employees/{id}` - Update an employee
     - `DELETE /api/employees/{id}` - Delete an employee

---

---

## Additional Notes

1. **Validation**:
   - Email format validation using `@Email`.
   - Mobile number validation with `@Pattern` for a 10-digit format.
   - Non-null and non-blank validations for required fields.

2. **Exception Handling**:
   - Global exception handling is implemented using `@ControllerAdvice`.

---

## Future Enhancements
- Implement pagination for retrieving all employees.
- Add search functionality (e.g., search by name or postal code).
- Enhance security with Spring Security.
- Add unit and integration tests.

---

## License
This project is licensed under the MIT License. See the LICENSE file for details.

