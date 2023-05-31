package com.mkpits.Employee123.service.impl;

import com.mkpits.Employee123.model.Employee;
import com.mkpits.Employee123.repo.employeerepo;
import com.mkpits.Employee123.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class employeeserviceImpl  implements EmployeeService {
@Autowired
employeerepo employeeRepository;
    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }
}
