package pl.piomin.services.employee.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import pl.piomin.services.employee.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, Long> {
	List<Employee> findByDepartmentId(Long departmentId);
	List<Employee> findByOrganizationId(Long organizationId);
}
