package com.jsp.HomeServeO.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.HomeServeO.Dto.Address;
import com.jsp.HomeServeO.service.AddressService;
import com.jsp.HomeServeO.util.ResponseStructure;

@RestController
public class AddressController {
	
	@Autowired
	private AddressService service;
	
	/*-------------------------------------------------------------------------------------------------------*/
	
	@PutMapping("/updateaddress")
	public ResponseEntity<ResponseStructure<Address>> updateAddress(@RequestBody Address address){
		return service.updateAddress(address);
	}
	
	/*-------------------------------------------------------------------------------------------------------*/

	@GetMapping("/addressbyid")
	public ResponseEntity<ResponseStructure<Address>> getAddressById(@RequestParam int id){
		return service.getAddressById(id);
	}

}
