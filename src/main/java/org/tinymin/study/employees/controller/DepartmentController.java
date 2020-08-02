package org.tinymin.study.employees.controller;

import org.tinymin.study.employees.model.Department;
import org.tinymin.study.employees.service.DepartmentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Api
@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/dept/{deptNo}")
    @ApiOperation(value = "부서조회", httpMethod = "GET")
    public Department selectDepartment(@PathVariable(name = "deptNo") String deptNo) {
        return departmentService.selectDepartmentByDeptNo(deptNo);
    }
}
