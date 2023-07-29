package com.jsp.HomeServeO.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.HomeServeO.Dto.Customer;
import com.jsp.HomeServeO.Dto.Vendors;
import com.jsp.HomeServeO.service.VendorsService;
import com.jsp.HomeServeO.util.ResponseStructure;

@RestController
public class VendorsController {
	
	@Autowired
	private VendorsService service;
	
	@PostMapping("/vendors")
	public ResponseEntity<ResponseStructure<Vendors>> saveVendor(@RequestBody Vendors vendors) {
		
		return service.saveVendors(vendors);
	}
	
	@PutMapping("/vendors")
	public ResponseEntity<ResponseStructure<Vendors>> updateVendors(@RequestBody Vendors vendors){
		return service.updateVendors(vendors);
	}
	
	@GetMapping("/vendors/login")
	public ResponseEntity<ResponseStructure<Vendors>> login(@RequestParam String email,@RequestParam String pasword){
		return service.login(email, pasword);
	}
	
	@GetMapping("/vendors/{id}")
	public ResponseEntity<ResponseStructure<Vendors>> getVendorById(@PathVariable int id){
		return service.getVendorById(id);
		
	}
	
	@GetMapping("/vendors")
	public ResponseEntity<ResponseStructure<List<Vendors>>> getAllVendors(){
		return service.getAllVendors();
	}
	
	@DeleteMapping("/vendors/{id}")
	public ResponseEntity<ResponseStructure<Vendors>> deletVendores(@PathVariable int id){
		return service.deleteVendors(id);
	}
	
	
	

}
