package org.gontuseries.springcore;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Restaurant implements InitializingBean, DisposableBean{

	public void greetCustomer() {

		System.out.println("Welcome dear customer!! This is the LifeCyce demo");
	}

	@Override
	public void afterPropertiesSet() throws Exception {

		System.out.println("Restaruant Bean is going through afterPropertiesSet");
	}

	@Override
	public void destroy() throws Exception {

		System.out.println("Restaruant Bean is destroying now");
	}

}