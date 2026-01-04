package com.adams.ems_backend.service.impl;

import com.adams.ems_backend.dto.EmployeeDto;
import com.adams.ems_backend.entity.Employee;
import com.adams.ems_backend.mapper.EmployeeMapper;
import com.adams.ems_backend.repository.EmployeeRepository;
import com.adams.ems_backend.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        // where you map the employee entity to the employee dto
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);

        //now save employee to database
        Employee savedEmployee = employeeRepository.save(employee);

        // now we return savedEmployees back to the client (map employee dto to employee entity)
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}
