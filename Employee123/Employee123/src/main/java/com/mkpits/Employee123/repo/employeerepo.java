package com.mkpits.Employee123.repo;

import com.mkpits.Employee123.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface employeerepo extends JpaRepository<Employee, Long> {
}
