package com.lifetree.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lifetree.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
