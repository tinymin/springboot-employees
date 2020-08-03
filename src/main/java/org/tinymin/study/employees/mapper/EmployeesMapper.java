package org.tinymin.study.employees.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.tinymin.study.employees.model.Employee;

@Mapper
public interface EmployeesMapper {
    Employee selectEmployeeById(String empNo);
}
