package com.infy.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.infy.app.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}