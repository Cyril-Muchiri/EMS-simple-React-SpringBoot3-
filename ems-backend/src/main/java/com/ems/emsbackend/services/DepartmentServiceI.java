package com.ems.emsbackend.services;

import java.util.List;

import com.ems.emsbackend.entity.Department;

public interface DepartmentServiceI {
    Department creaDepartment(Department department);
    List<Department> getDepartments();
    
}
