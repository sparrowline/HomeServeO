package com.jsp.HomeServeO.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

}
