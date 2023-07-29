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
	/*-------------------------------------------------------------------------------------------------------*/

	public List<Customer> getAllCustomer() {
		return repo.findAll();
	}

	/*-------------------------------------------------------------------------------------------------------*/

	/*
	 * findById is present inside optional class of CustomerType hence we need to
	 * save it in optional class and through its reference variable use get() to
	 * fetch that particular
	 */
	public Customer getCustomerById(int id) {

		if (repo.findById(id).isPresent()) {
			Customer customer = repo.findById(id).get();
			return customer;
		} else {

			return null;
		}
	}

	/*-------------------------------------------------------------------------------------------------------*/

	public Customer deleteCustomer(int id) {

		Customer customer = repo.findById(id).get();
		if (customer != null) {

			repo.delete(customer); // directly we can't delet it because delete() return type is void.

			return customer;
		}
		// we can throw exception here if your enterd id is not present.
		return null;
	}

	/*-------------------------------------------------------------------------------------------------------*/

	/*
	 * taking the user updated values in the object if user not have updated all the
	 * values then we will take it from the databse and initialised it so that other
	 * won't get updated with the default null values.
	 */
	public Customer updateCustomer(Customer customer) {
		Customer db = repo.findById(customer.getId()).get();
		if (db != null) {
			if (customer.getName() == null) {
				customer.setName(db.getName());

			}
			if (customer.getEmail() == null) {
				customer.setEmail(db.getEmail());
			}
			if (customer.getAddress() == null) {
				customer.setAddress(db.getAddress());
			}
			if (customer.getFamilyCount() == 0) {
				customer.setFamilyCount(db.getFamilyCount());
			}
			if (customer.getPasword() == null) {
				customer.setPasword(db.getPasword());
			}
			if (customer.getPhone() == 0) {
				customer.setPhone(db.getPhone());
			}
			if (customer.getWorks() == null) {
				customer.setWorks(db.getWorks());
			}
			repo.save(customer);

			return customer;
		}
		return null;

	}

	/*-------------------------------------------------------------------------------------------------------*/

	// CRUD operations by using email this () is used to perform login operations

	public Customer getCustomerByEmail(String email) {
		Customer customer = repo.findByEmail(email);
		if (customer != null) {
			return customer;
		} else
			return null;
	}

	public void deleteCustomerByEmail(String email) {
		Customer customer = repo.findByEmail(email);
		if (customer != null) {
			repo.delete(customer);
		}

	}
	/*-------------------------------------------------------------------------------------------------------*/

}
