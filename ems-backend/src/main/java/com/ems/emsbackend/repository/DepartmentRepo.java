package com.ems.emsbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.emsbackend.entity.Department;

public interface DepartmentRepo  extends JpaRepository<Department,Long>{
    
}
