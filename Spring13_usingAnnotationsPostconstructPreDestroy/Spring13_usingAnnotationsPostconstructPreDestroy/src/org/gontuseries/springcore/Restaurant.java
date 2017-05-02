package org.gontuseries.springcore;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Restaurant {

	public void greetCustomer() {

		System.out.println("Welcome dear customer!! This is the LifeCyce demo");
	}

	@PostConstruct
	public void afterPropertiesSet() throws Exception {

		System.out.println("Restaruant Bean is going through afterPropertiesSet");
	}

	@PreDestroy
	public void destroy() throws Exception {

		System.out.println("Restaruant Bean is destroying now");
	}

}