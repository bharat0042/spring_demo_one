package com.bharat.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanscope_demo_applicationContext.xml");
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		boolean result = (theCoach == alphaCoach);
		System.out.println("are the two coach equal -" + result);
		System.out.println("memory location for theCoach -" + theCoach);
		System.out.println("memory location for alphaCoach -" + alphaCoach);
		context.close();
	}

}
