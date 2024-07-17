package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.Customer;
import com.nt.model.Login_user_details;
import com.nt.service.CustomerService;

@Controller
public class CustomerController {
	
	private CustomerService service;
	private String login_user_details ="rahul";
	private String user_password = "1008";
	private Boolean login_status=false;
	
	
	@GetMapping("/") // home page
	public String home() {
		System.out.println(" home()");
		return "home";
	}
	
	@GetMapping("/login") //login from page
	public String login(@ModelAttribute("user") Login_user_details user) {
		System.out.println("Login()");
		return "login";
	}
	
	@PostMapping("/login") //login page if correct info redirect to report else redirect to login
	public String login(Map<String,Object> map, @ModelAttribute("user") Login_user_details user) {
		System.out.println("login01 ");
		if (user.getLogin_id().equals(login_user_details)  & user.getPassword().equals(user_password)) {
			System.out.println("login02");
			login_status=true;
			return "redirect:/report";
		}
		
		else 
			System.out.println("login03");
			return "home";
	}
	
	@GetMapping("/report")// getting customers info
	public String CustomerList(Map<String,Object> map) {
		System.out.println("Customer report");
		if (login_status.equals(false)) {// checking user login or not
			System.out.println("Customer_not_login");
			return "redirect:/login";
		}
		System.out.println("Customer_login");
		List<Customer> list = service.getAllCustomer();
		System.out.println("above the map");
		map.put("CustmoerData",list);
		return "customer_report";
	}
	
		@GetMapping("/Customer_register")
		public String login() {
			System.out.println("Customer_register_entry()");
			
			if (login_status.equals(true)) {
				System.out.println("Customer_register()");
				return "redirect:/customer_report";
			}
			else {
				System.out.println("Customer_register_failed");
				return "redirect:/login";
				}
		}
	
	@GetMapping("/add")
	public String showAddEmployeeForm(@ModelAttribute("cum") Customer cum) {
		System.out.println("@GetMapping(\"/add\") ");
		
//		if (login_status.equals(false)) {// checking user login or not
//			System.out.println("Customer_not_login");
//			return "redirect:/login";
//		}
		return "Customer_register";
	}
	
	
	@PostMapping("/add")
	public String addEmployee(Map<String,Object> map, @ModelAttribute("cum") Customer cum) {
		System.out.println("postMapping(\"/add\") ");
		String result = service.registerCustomer(cum);
		System.out.println("customer register sucessfully");
		//List<Customer> list = service.getAllCustomer();
		//System.out.println("customers fected sucessfully");
		map.put("resultMsg", result);
		//map.put("customer", list);
		return "customer_report";
	}
	
	
	
}
