package camilo.ems_backend.mapper;

import camilo.ems_backend.dto.EmployeeDto;
import camilo.ems_backend.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee) {
    
        return new EmployeeDto(
            employee.getId(),
            employee.getFirstName(),
            employee.getLastName(),
            employee.getEmail()
            );
    }
    
    public static Employee mapToEmployee(EmployeeDto employeedDto){
        return new Employee(
            employeedDto.getId(),
            employeedDto.getFirstName(),
            employeedDto.getLastName(),
            employeedDto.getEmail()
        );
    }
}
