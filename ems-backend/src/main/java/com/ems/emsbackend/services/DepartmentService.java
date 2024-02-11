package com.ems.emsbackend.services;

import org.springframework.stereotype.Service;

import com.ems.emsbackend.dto.DepartmentDto;
import com.ems.emsbackend.entity.Department;
import com.ems.emsbackend.mapper.DepartmentMapper;
import com.ems.emsbackend.repository.DepartmentRepo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DepartmentService implements DepartmentServiceI {

    private DepartmentRepo departmentRepo;

    @Override
    public DepartmentDto creaDto(DepartmentDto departmentDto) {

        Department department = DepartmentMapper.mapToDepartment(departmentDto);
        Department savedDepartmnet = departmentRepo.save(department);

        return DepartmentMapper.mapToDto(savedDepartmnet);
    }

}
