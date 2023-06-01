package com.mkpits.Employee123.service;

import com.mkpits.Employee123.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployee();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);

    void deleteEmployeeById(long id);
}
