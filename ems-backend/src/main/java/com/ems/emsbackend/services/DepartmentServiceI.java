package com.ems.emsbackend.services;

import java.util.List;
import com.ems.emsbackend.entity.Department;

public interface DepartmentServiceI {
    Department createDepartment(Department department);

    List<Department> getDepartments();

    Department getById(Long id);

    Department getByName(String name);

    Department updateDepartment(Department department);

    // String deleteDepartment(Department department);
    public String deleteDepartmentById(long id);

}
