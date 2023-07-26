package com.jsp.HomeServeO.Dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;
@Data
@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@Column(unique = true)
	private String email;
	private long phone;
	private String pasword;
	private int familyCount;
	@OneToOne
	private Address address;
	@OneToMany(mappedBy = "customer")
	private List<Work> works;
	
	

}
