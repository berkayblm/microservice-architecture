package com.berka.employeeservice.repository;

import com.berka.employeeservice.dto.EmployeeDto;
import com.berka.employeeservice.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {



}
