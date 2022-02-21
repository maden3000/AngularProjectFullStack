package com.example.spring_boot_back_end.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import  com.example.spring_boot_back_end.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}