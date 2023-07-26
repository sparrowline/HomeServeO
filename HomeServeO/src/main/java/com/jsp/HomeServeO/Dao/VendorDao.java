package com.jsp.HomeServeO.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.HomeServeO.Dto.Vendors;
import com.jsp.HomeServeO.Repo.VendorRepo;

@Repository
public class VendorDao {

	@Autowired
	VendorRepo repo;

	public Vendors saveVendor(Vendors vendor) {
		return repo.save(vendor);

	}

	public List<Vendors> getAllVendors() {
		return repo.findAll();
	}

	public Vendors getVendorsById(int id) {
		Optional<Vendors> optional = repo.findById(id);
		return optional.get();
	}

	public void deletecustomer(int id) {
		Optional<Vendors> optional = repo.findById(id);
		if (optional != null) {
			repo.delete(optional.get());
		}
	}

	public Vendors updateVendors(Vendors vendor) {

		Optional<Vendors> optional = repo.findById(vendor.getId());
		if (optional != null) {
			return repo.save(optional.get());
		}
		return null;

	}

	// CRUD operations By using email

	public Vendors getVendorByEmail(String email) {
		Vendors vendors = repo.findByEmail(email);
		return vendors;
	}
	
	public void deleteVendorByEmail(String email) {
		Vendors vendors= repo.findByEmail(email);
		if(vendors!=null) {
			 repo.delete(vendors);
		}
		
	}

}
