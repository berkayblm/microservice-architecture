package com.berka.employeeservice.service;

import com.berka.employeeservice.dto.APIResponseDto;
import com.berka.employeeservice.dto.EmployeeDto;

public interface EmployeeService {

    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    APIResponseDto getEmployeeById(Long employeeId);
}
