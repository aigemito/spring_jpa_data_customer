package com.emito;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.emito.models.Customer;
import com.emito.repos.CustomerRepo;

@SpringBootTest
class CustomerApplicationTests {
	@Autowired
	CustomerRepo repo;
	@Test
	void contextLoads() {
	}

	@Test
	void testCreate() {
		Customer c=new Customer(1,"amanuel","aigemito.2006@gmail.com");
		repo.save(c);
	}
	
	@Test
	void testUpdate() {
		Customer c=repo.findById(1).get();
		c.setName("emito");
	    repo.save(c);
	}
	
	@Test
	void testDelete() {
		repo.deleteById(1);
	}
	
	void testSearch() {
		if(repo.existsById(1)) {
			repo.findById(1);
		}
	}
}
