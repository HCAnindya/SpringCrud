package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service	
public class HomeServiceImpl implements HomeService {

	@Autowired
	HomeRepository repository;
	
	@Override
	public List<Home> getHomePageDetails() {
		return repository.findAll();
		 
	}

	@Override
	public Home insertHomePageDetails(Home home) {
		return repository.save(home);
	}

}
