package org.tinymin.study.employees.service;

import org.tinymin.study.employees.mapper.DepartmentMapper;
import org.tinymin.study.employees.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DepartmentService {
    private DepartmentMapper departmentMapper;

    @Autowired
    public DepartmentService(DepartmentMapper departmentMapper) {
        this.departmentMapper = departmentMapper;
    }

    public Department selectDepartmentByDeptNo(String deptNo) {
        Department department = departmentMapper.selectDepartmentById(deptNo);
        return department;
    }
}
