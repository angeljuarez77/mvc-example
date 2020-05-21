package com.example.projectname.repository;

import com.example.projectname.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}