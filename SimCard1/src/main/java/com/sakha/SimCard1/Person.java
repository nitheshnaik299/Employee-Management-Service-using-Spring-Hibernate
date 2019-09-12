package com.sakha.SimCard1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 	//ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
    	Mobile m=context.getBean("mobile",Mobile.class);
    	//Sim sim=context.getBean("airtel",Sim.class);
    	//m.setSim(sim);
    	//m.getSim().setCallCharge(1.3f);
    	m.sendSms();
    	m.browseInternet();
    	m.makeACall(); 
    	m.sendMms();
    	m.supNet();
    	
    	//Mobile nokia=context.getBean("mobile",Mobile.class);
    	//nokia.makeACall();
    	
    	

	}

}
