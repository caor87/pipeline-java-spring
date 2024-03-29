package com.action.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arakelian.faker.model.Address;
import com.arakelian.faker.model.Person;
import com.arakelian.faker.service.RandomAddress;
import com.arakelian.faker.service.RandomPerson;

@RestController
@RequestMapping("/")
public class HomeController {
	
	@GetMapping
	public String healthCheck() {
		return "OK";
	}
	
	@GetMapping("/people")
	public List<Person> getPeople(){
		//OK
		return RandomPerson.get().listOf(20);
	}
	
	@GetMapping("/address")
	public List<Address> getAddres(){
		return RandomAddress.get().listOf(5);
	}

}
