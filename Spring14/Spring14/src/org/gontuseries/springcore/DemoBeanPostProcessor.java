package org.gontuseries.springcore;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.core.PriorityOrdered;

public class DemoBeanPostProcessor implements BeanPostProcessor {
	
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {

		System.out.println("processing bean instance after initialization ( i.e just after init life cycle event ) of: " + beanName);
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		
		System.out.println("processing bean instance before initialization ( i.e after spring instantiates bean and before init life cycle event ) of: " + beanName);
		return bean;
	}

}