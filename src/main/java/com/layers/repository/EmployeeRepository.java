package com.layers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.layers.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
