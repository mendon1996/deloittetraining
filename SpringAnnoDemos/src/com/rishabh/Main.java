package com.rishabh;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
	
	public static void main(String[] args) {
		/*Employee employee = new Employee();
		employee.setEmployeeName("Rohan");*/
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Employee employee = context.getBean(Employee.class);
		Address address = context.getBean(Address.class);
		
		System.out.println(employee);
		
		employee.setEmployeeName("Rishabh");
		
		address.setaId(69);
		address.setCity("Mithapur");
		address.setState("Gujarat");
		
		employee.setAddress(address);
		
		System.out.println(employee);
	}
}
