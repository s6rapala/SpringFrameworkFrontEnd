package com.haeger.task.customerservices.controller;

import com.haeger.task.customerservices.service.Customer;
import com.haeger.task.customerservices.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CustomerController {

	private CustomerService customerService;

	@Autowired
	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}

	@GetMapping(value="/customers")
	public ModelAndView getCustomersInUi() {
		List<Customer> customerList = customerService.getCustomers();
		Map<String, Object> attributeMap = new HashMap<>();
		attributeMap.put("customers", customerList);
		return new ModelAndView("customers", attributeMap);
	}

	@GetMapping(value = "/customers/{id}", produces = MediaType.APPLICATION_XML_VALUE)
	public ModelAndView getCustomer(@PathVariable( name = "id") String id) {
		Customer customer = customerService.getCustomer(id);
		Map<String, Object> attributeMap = new HashMap<>();
		attributeMap.put("customer", customer);
		return new ModelAndView("customer", attributeMap);
	}
}
