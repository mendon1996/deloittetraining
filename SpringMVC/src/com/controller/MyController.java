package com.controller;

import javax.xml.ws.RequestWrapper;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.deloitte.javatraining.entity.Customer;

@Controller
public class MyController {

	@RequestMapping("/Go")
	public String pp()
	{
		return "mohan";
	}
	
	@RequestMapping("/data")
	public ModelAndView data(Customer customer)
	{
		return new ModelAndView("result","cust",customer);
	}
	
	@RequestMapping("/")
	public String index() {
		
		return "index";
	}
	
	@RequestMapping("/GoToHtml")
	public String GoToHtml()
	{
		
		return "Go";
	}
	

	
	@RequestMapping("/Customer")
	public ModelAndView customer()
	{
		
		return new ModelAndView("Customer","command",new Customer());
	}
	
	/*@RequestMapping("/Customer")
	public String customer()
	{
		
		return "Customer";
	}*/
	
}