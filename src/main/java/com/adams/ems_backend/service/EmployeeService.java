package com.adams.ems_backend.service;

import com.adams.ems_backend.dto.EmployeeDto;
import com.adams.ems_backend.repository.EmployeeRepository;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
}
