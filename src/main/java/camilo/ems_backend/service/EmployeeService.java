package camilo.ems_backend.service;

import java.util.List;

import camilo.ems_backend.dto.EmployeeDto;


public interface EmployeeService {

    EmployeeDto createEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployeeById(Long employeeId);
    List<EmployeeDto> getAllEmployees();
    EmployeeDto updaEmployee(Long employeeId, EmployeeDto updaEmployeeDto);
    void deleteEmployee(Long employeeId);

}
