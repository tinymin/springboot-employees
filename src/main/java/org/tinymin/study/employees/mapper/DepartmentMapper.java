package org.tinymin.study.employees.mapper;

import org.tinymin.study.employees.model.Department;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DepartmentMapper {
    Department selectDepartmentById(String deptNo);
}
