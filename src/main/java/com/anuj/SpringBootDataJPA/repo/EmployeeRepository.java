package com.anuj.SpringBootDataJPA.repo;

import com.anuj.SpringBootDataJPA.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
