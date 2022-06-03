package com.springboot_project_1.Repository;

import com.springboot_project_1.model.Employee;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeJpaRepository extends JpaRepository<Employee,Long> {
}
