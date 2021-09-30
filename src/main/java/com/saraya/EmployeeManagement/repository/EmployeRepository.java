package com.saraya.EmployeeManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saraya.EmployeeManagement.entity.Employe;

public interface EmployeRepository extends JpaRepository<Employe,Long>{

}
