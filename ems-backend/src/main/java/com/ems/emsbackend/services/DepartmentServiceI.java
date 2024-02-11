package com.ems.emsbackend.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.ems.emsbackend.entity.Department;

public interface DepartmentServiceI {
    Department creaDepartment(Department department);
    List<Department> getDepartments();
    Department getById(Long id);
    Department getByName(String name);
   Department updateDepartment(Department department);
    
}
