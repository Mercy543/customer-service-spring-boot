package com.simplilear.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilear.springdemo.model.Customer;
import com.simplilear.springdemo.repository.CustomerRepository;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@GetMapping(path="/customers")
	public List<Customer> RetrieveAllCustomers(){
		
		return customerRepository.findAll();
	}
	
	@GetMapping(path ="/customers/{id}")
	public Customer RetrieveCustomer(int id) {
		return customerRepository.findById(id).get();
	}

}
