package org.tinymin.study.employees.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tinymin.study.employees.mapper.EmployeesMapper;
import org.tinymin.study.employees.model.Employee;

@Service
public class EmployeesService {
    @Autowired
    private EmployeesMapper employeesMapper;

    public Employee getEmployee(String empNo) {
        Employee employee = employeesMapper.selectEmployeeById(empNo);
        return employee;
    }
}
