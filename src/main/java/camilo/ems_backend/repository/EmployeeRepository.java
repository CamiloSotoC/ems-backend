package camilo.ems_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import camilo.ems_backend.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {


}