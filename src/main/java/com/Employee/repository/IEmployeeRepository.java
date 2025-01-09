package com.Employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Employee.model.Employee;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {

}
