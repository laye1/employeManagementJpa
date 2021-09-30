package com.saraya.EmployeeManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.saraya.EmployeeManagement.dto.EmployeDTO;
import com.saraya.EmployeeManagement.entity.Employe;
import com.saraya.EmployeeManagement.repository.EmployeRepository;

@Service("employeService")
public class EmployeServiceImp implements EmployeService{
	
	@Autowired
	private EmployeRepository repository;

	@Override
	public void insertCustomer(EmployeDTO employe) {
		
		repository.saveAndFlush(EmployeDTO.prepareEmployeEntity(employe));
		
	}

	@Override
	public Page<Employe> findAll(Pageable page) {
		
		return repository.findAll(page);
	}

	@Override
	public List<Employe> findAll(Sort sort) {
		
		return repository.findAll(sort);
	}

}
