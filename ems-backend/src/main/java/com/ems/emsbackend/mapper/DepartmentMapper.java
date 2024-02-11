package com.ems.emsbackend.mapper;

import com.ems.emsbackend.dto.DepartmentDto;
import com.ems.emsbackend.entity.Department;

public class DepartmentMapper {

    // maps jpa entity to dto
    public static DepartmentDto mapToDto(Department department) {
        return new DepartmentDto(department.getId(), department.getDepartmentName(), department.getDepartmentDesc());
    }

    // maps dto to jpa entity
    public static Department mapToDepartment(DepartmentDto departmentDto) {
        return new Department(departmentDto.getId(), departmentDto.getDepartmentName(),
                departmentDto.getDepartMentDescription());
    }
}
