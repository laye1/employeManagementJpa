package com.saraya.EmployeeManagement.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.saraya.EmployeeManagement.dto.EmployeDTO;
import com.saraya.EmployeeManagement.entity.Employe;



public interface EmployeService {
	
	public void insertCustomer(EmployeDTO employe) ;
    Page<Employe> findAll(Pageable page);
    List<Employe> findAll(Sort sort);
 

}
