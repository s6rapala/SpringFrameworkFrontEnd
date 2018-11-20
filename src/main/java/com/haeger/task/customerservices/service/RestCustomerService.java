package com.haeger.task.customerservices.service;

import com.haeger.task.customerservices.service.proxy.ProxyCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestCustomerService implements CustomerService {

  private ProxyCustomerService proxyCustomerService;

  @Autowired
  public RestCustomerService(ProxyCustomerService proxyCustomerService) {
    this.proxyCustomerService = proxyCustomerService;
  }

  @Override
  public List<Customer> getCustomers() {
    return proxyCustomerService.getCustomers();
  }

  @Override
  public Customer getCustomer(String customerId) {
    return proxyCustomerService.getCustomer(customerId);
  }
}
