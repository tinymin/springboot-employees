package org.tinymin.study.employees.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

@Data
@Alias("departments")
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private String deptNo;
    private String deptName;
}
