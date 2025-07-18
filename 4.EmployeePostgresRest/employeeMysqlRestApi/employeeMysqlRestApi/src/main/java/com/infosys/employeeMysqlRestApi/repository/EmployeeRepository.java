package com.infosys.employeeMysqlRestApi.repository;

import com.infosys.employeeMysqlRestApi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {
}
