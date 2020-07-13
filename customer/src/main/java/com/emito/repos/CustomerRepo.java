package com.emito.repos;

import org.springframework.data.repository.CrudRepository;

import com.emito.models.Customer;

public interface CustomerRepo extends CrudRepository<Customer, Integer> {
	
}
