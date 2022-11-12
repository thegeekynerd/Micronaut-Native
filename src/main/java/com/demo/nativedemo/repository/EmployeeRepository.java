package com.demo.nativedemo.repository;

import com.demo.nativedemo.entity.Employee;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
