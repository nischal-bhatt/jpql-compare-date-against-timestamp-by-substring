package com.example.demo.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	List<Employee> findByDept(String dept);

	@Query("select a from Employee a where SUBSTRING(CAST(a.joinedDate AS STRING),0,10) = :joinedDate and a.status = :status")
	List<Employee> pablo(String joinedDate,String status);

}
