package com.ems.emsbackend.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ems.emsbackend.dto.DepartmentDto;
import com.ems.emsbackend.entity.Department;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DepartmentService implements DepartmentServiceI {

    private DepartmentDto departmentDto;

    @Override
    public Department creaDepartment(Department department) {
       Department createDepartment=departmentDto.save(department);
       return createDepartment;
    }

    @Override
    public List<Department> getDepartments() {
        // Department department = DepartmentMapper.mapToDepartment(departmentDto);
        List <Department> allDepartmnets = departmentDto.findAll();
        // List<DepartmentDto> savDepartmentDtos=DepartmentMapper.mapToDto(allDepartmnets);

        return allDepartmnets;

    }

 

}
