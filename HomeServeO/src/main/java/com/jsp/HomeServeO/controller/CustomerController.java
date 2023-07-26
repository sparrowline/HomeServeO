package com.jsp.HomeServeO.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.HomeServeO.Dto.Customer;
import com.jsp.HomeServeO.service.CustomerService;
import com.jsp.HomeServeO.util.ResponseStructure;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService service;

	@PostMapping("/customer")
	public ResponseEntity<ResponseStructure<Customer>> saveCustomer(@RequestBody Customer customer) {
		
		return service.saveCustomer(customer);
	}
	
}
