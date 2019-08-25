package pl.piomin.services.department.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import pl.piomin.services.department.model.Department;

public interface DepartmentRepository extends MongoRepository<Department, Long> {

	public List<Department> findByOrganizationId(Long organizationId);

}
