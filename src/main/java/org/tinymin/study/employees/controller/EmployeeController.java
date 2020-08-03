package org.tinymin.study.employees.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.tinymin.study.employees.model.Employee;
import org.tinymin.study.employees.service.EmployeesService;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeesService employeesService;

    @GetMapping("/emp/{empNo}")
    public Employee getEmployee(@PathVariable("empNo") String empNo) {
        return employeesService.getEmployee(empNo);
    }
}
