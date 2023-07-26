package com.jsp.HomeServeO.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jsp.HomeServeO.Dto.Vendors;

public interface VendorRepo extends JpaRepository<Vendors, Integer> {
	
	@Query("Select a from Vendors a where email=?1")
	public Vendors findByEmail(String email);
	
	
	

}
