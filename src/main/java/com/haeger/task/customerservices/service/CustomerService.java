package com.haeger.task.customerservices.service;

import java.util.List;

public interface CustomerService {

  List<Customer> getCustomers();

  Customer getCustomer(String customerId);
}
