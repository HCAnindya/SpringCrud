package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@Autowired
	HomeService homeService;
	
	@GetMapping
	public Home home() {
		return homeService.getHomePageDetails().get(0)	;
		
	}
	
	@GetMapping(value = ("insertHomePageDetails"))
	public Home insert() {
		return homeService.insertHomePageDetails(new Home("header1", "Description1", "Footer1"));
		
	}
}
