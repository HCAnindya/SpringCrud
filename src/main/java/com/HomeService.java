package com;

import java.util.List;

import org.springframework.stereotype.Service;


@Service
public interface HomeService {
	
	List<Home> getHomePageDetails();

	Home insertHomePageDetails(Home home);

}
