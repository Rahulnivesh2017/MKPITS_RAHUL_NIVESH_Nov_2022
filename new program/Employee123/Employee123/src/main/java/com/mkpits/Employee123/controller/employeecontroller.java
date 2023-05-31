package com.mkpits.Employee123.controller;

import com.mkpits.Employee123.model.Employee;
import com.mkpits.Employee123.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class employeecontroller {
//rupalibarde311@gmail.com
    // display list of employees
    @Autowired
    EmployeeService employeeService;
    @GetMapping("/")
   public String viewHomePage(Model model){
        List<Employee> employeeList = employeeService.getAllEmployee();
        model.addAttribute("listEmployee",employeeList);
        return "index";
   }

}
