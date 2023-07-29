package com.jsp.HomeServeO.Dto;

import java.util.List;import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;
@Entity
@Data
public class Vendors {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@Column(unique = true)
	private String email;
	private long phone;
	private String password;
	private double costPerDay;
	@OneToOne
	private Address address;
	
	private String role;
	@OneToMany
	private List<ServiceCost> costs;
	
	

}
