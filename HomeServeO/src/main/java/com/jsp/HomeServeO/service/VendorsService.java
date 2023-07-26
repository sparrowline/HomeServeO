package com.jsp.HomeServeO.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.HomeServeO.Dao.VendorDao;
import com.jsp.HomeServeO.Dto.Vendors;
import com.jsp.HomeServeO.util.ResponseStructure;

@Service
public class VendorsService {
	
	@Autowired
	private VendorDao dao;
	
	public ResponseEntity<ResponseStructure<Vendors>> saveVendors(Vendors vendor) {
		ResponseStructure<Vendors> structure = new ResponseStructure<Vendors>();
		
		structure.setData(dao.saveVendor(vendor));
		structure.setMessage("Vendor saved Successfully ");
		structure.setStatus(HttpStatus.CREATED.value());
		
		return new ResponseEntity<ResponseStructure<Vendors>>(structure, HttpStatus.CREATED);
		
	}

}
