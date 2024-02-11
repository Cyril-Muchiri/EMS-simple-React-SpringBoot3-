package com.ems.emsbackend.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public ResponseEntity<Department> createDepartment(@RequestBody Department newDepartment) {
        Department department = departmentServiceI.creaDepartment(newDepartment);
        return new ResponseEntity<>(department, HttpStatus.CREATED);
    }

    @GetMapping
    public List<Department> getAllDeaprtments(){
        return departmentServiceI.getDepartments();
    }

}
