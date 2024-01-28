package com.berka.employeeservice.controller;


import com.berka.employeeservice.dto.APIResponseDto;
import com.berka.employeeservice.dto.EmployeeDto;
import com.berka.employeeservice.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/employees")
@AllArgsConstructor
public class EmployeeController {

    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employeeDto) {

        EmployeeDto savedEmployee = employeeService.saveEmployee(employeeDto);

        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    @GetMapping("{employee-id}")
    public ResponseEntity<APIResponseDto> getEmployee(@PathVariable("employee-id") Long empId) {

        APIResponseDto apiResponseDto = employeeService.getEmployeeById(empId);

        return new ResponseEntity<>(apiResponseDto, HttpStatus.OK);
    }
}
