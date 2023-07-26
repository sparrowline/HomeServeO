package com.jsp.HomeServeO.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.HomeServeO.Dto.Customer;
import com.jsp.HomeServeO.Repo.CustomerRepo;

@Repository
public class CustomerDao { 
	
	@Autowired
	CustomerRepo repo;
	
	public Customer saveCustomer(Customer customer) {
		return repo.save(customer);
		
	}
	
	public List<Customer> getAllCustomer(){
		return repo.findAll();
	}
	
	
	/*findById is present inside optional class of CustomerType hence we need to save it in optional class and 
	 * through its reference variable use get() to fetch that particular*/
	public Customer getCustomerById(int id) {
		Optional<Customer> optional = repo.findById(id);
		return optional.get();
	}
	
	public void deleteCustomer(int id) {
		Optional<Customer> optional= repo.findById(id);
		if(optional!=null) {
			repo.delete(optional.get());
		}else
		System.out.println("object not found");
	}
	
	//taking find by from optionalclas of util package
	public Customer updateCustomer(Customer customer) {
	Optional<Customer> optional =	repo.findById(customer.getId());
	if(optional!=null) {
		
		//in SpringBoot we have save() only for saving and updating.
		repo.save(optional.get());
		return optional.get();
	}
	return null;	
	}
	
	//CRUD operations by using email
	
	public Customer getCustomerByEmail(String email) {
		Customer customer = repo.findByEmail(email);
		return customer;
	}
	
	public void deleteCustomerByEmail(String email) {
		Customer customer =repo.findByEmail(email);
		if(customer!= null) {
			repo.delete(customer);
		}
		
	}
	
	
	

}
