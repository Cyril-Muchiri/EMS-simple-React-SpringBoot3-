package com.ems.emsbackend.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ems.emsbackend.dto.DepartmentDto;
import com.ems.emsbackend.entity.Department;
import com.ems.emsbackend.services.DepartmentServiceI;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    @Autowired
    private DepartmentServiceI departmentServiceI;

    @PostMapping
    public ResponseEntity<DepartmentDto> createDepartment(@RequestBody DepartmentDto departmentDto) {
        DepartmentDto dto = departmentServiceI.creaDto(departmentDto);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }

}
