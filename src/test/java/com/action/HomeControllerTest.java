package com.action;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.action.controller.HomeController;

@SpringBootTest
class HomeControllerTest {
	
	@Autowired
	HomeController homeController;

	@Test
	public void homeCOntroller_healthCheck_ReturnsOK() {
		assertEquals(homeController.healthCheck(), "OK");
	}
	
	@Test
	public void homeCOntroller_getPeople_ReturnsListOf20People() {
		assertEquals(homeController.getPeople().size(), 20);
	}

}
