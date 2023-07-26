package com.jsp.HomeServeO.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.HomeServeO.Dao.CustomerDao;
import com.jsp.HomeServeO.Dto.Customer;
import com.jsp.HomeServeO.util.ResponseStructure;

@Service
public class CustomerService {
	@Autowired
	private CustomerDao dao;

	public ResponseEntity<ResponseStructure<Customer>> saveCustomer(Customer customer){
		
		ResponseStructure< Customer> structure= new ResponseStructure<Customer>();
		structure.setData(dao.saveCustomer(customer));
		structure.setMessage("customer saved successfully");
		structure.setStatus(HttpStatus.CREATED.value());
		
		/*here we are passing object of responseEntity object which is a constructor accepts two value one is structure
		and httpStataus of particular value (dont use valu())*/
		return new ResponseEntity<ResponseStructure<Customer>>(structure, HttpStatus.CREATED);
		
	}
}
