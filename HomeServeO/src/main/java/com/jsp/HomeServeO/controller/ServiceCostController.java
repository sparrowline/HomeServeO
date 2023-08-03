package com.jsp.HomeServeO.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.jsp.HomeServeO.Dto.ServiceCost;
import com.jsp.HomeServeO.service.ServiceCostService;
import com.jsp.HomeServeO.util.ResponseStructure;

public class ServiceCostController {
	
	//save() , payment() 
	
	private ServiceCostService service;
	
	/*-------------------------------------------------------------------------------------------------------*/
	
	//saving the cost the ServiceCost based on vendorId and WorkId
	@PostMapping("/cost")
	public ResponseEntity<ResponseStructure<ServiceCost>> saveServiceCost(@RequestParam int v_id,@RequestParam int w_id){
		return service.saveCost(v_id, w_id);
	}
	
	/*-------------------------------------------------------------------------------------------------------*/
	
	//payment to vendor based on CustomerId and fetching through serviceCost
	@GetMapping("/pay")
	public ResponseEntity<ResponseStructure<ServiceCost>> payment(@RequestParam int c_id,@RequestBody ServiceCost cost){
		return service.payment(c_id, cost);
	}
	

}
