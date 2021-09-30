package com.saraya.EmployeeManagement;

import org.apache.log4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.saraya.EmployeeManagement.dto.EmployeDTO;
import com.saraya.EmployeeManagement.entity.Employe;
import com.saraya.EmployeeManagement.repository.EmployeRepository;
import com.saraya.EmployeeManagement.service.EmployeService;



@SpringBootApplication
public class Client implements CommandLineRunner{
	

	static Logger logger = Logger.getLogger(Client.class);
    @Autowired
    EmployeService service;
    
    @Autowired
    EmployeRepository repository;
    
    
    public static void main(String[] args) {
        SpringApplication.run(Client.class, args);
    }
 
    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
      EmployeDTO employe1 = new EmployeDTO(1,"ndiaye","oumy","point E",500);
      EmployeDTO employe2 = new EmployeDTO(2,"ndiaye","laye","point E",500);
      EmployeDTO employe3 = new EmployeDTO(3,"diop","ngor","point E",2000);
      EmployeDTO employe4 = new EmployeDTO(4,"faye","diarry","Ben Tally",1500);
      EmployeDTO employe5 = new EmployeDTO(5,"pouye","aliou","point E",1000);
      EmployeDTO employe6 = new EmployeDTO(6,"pouye","ethas","point E",1000);
      
      
      
       service.insertCustomer(employe1);
       service.insertCustomer(employe2);
       service.insertCustomer(employe3);
       service.insertCustomer(employe4);
       service.insertCustomer(employe5);
       service.insertCustomer(employe6);
       
        
        int k=(int) (repository.count()/3);
        logger.info("The First Three Records are: ");
        for(int i=0;i<=k;i++) {
        
        Pageable pageable = PageRequest.of(i,1);
        
       
        Iterable<Employe> employe = service.findAll(pageable);
                
        for(Employe employ : employe){
             logger.info(employ);
        }
        }
        
        logger.info("Sorted records by name");
            
       Iterable<Employe> employee = service.findAll(Sort.by(Sort.Direction.DESC,"firstName"));
        
        for(Employe employ: employee){
             logger.info(employ);
        }  
        
        logger.info("----");
        
        
       
        
        	for(int j=0;j<=3;j++) {
        	Pageable pageable2 = PageRequest.of(j,1);
            
            Iterable<Employe> employ = service.findAll(pageable2);
           employ = service.findAll(Sort.by(Sort.Direction.DESC, "salary"));
          
            
            for(Employe empl:employ) {
            
            	logger.info(empl);
             
            }
        	}
         
        	}
        }
        
        
    

    




