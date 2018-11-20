package com.haeger.task.customerservices.service.proxy;

import com.haeger.task.customerservices.service.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProxyCustomerService {

  private final RestTemplate restTemplate = new RestTemplate();
  private RestCustomerProxyConfiguration restCustomerProxyConfiguration;

  @Autowired
  public ProxyCustomerService(RestCustomerProxyConfiguration restCustomerProxyConfiguration) {
    this.restCustomerProxyConfiguration = restCustomerProxyConfiguration;
  }

  public List<Customer> getCustomers() {
    String url = restCustomerProxyConfiguration.getCustomersUrl();
    ProxyCustomers proxyCustomers = restTemplate.getForObject(url, ProxyCustomers.class);

    List<Customer> customerList = new ArrayList<>();
    for (ProxyCustomer proxyCustomer: proxyCustomers.getCustomerList()) {
      Customer customer = convertCustomerProxy(proxyCustomer);
      customerList.add(customer);
    }

    return customerList;
  }

  public Customer getCustomer(String customerId) {
    String url = restCustomerProxyConfiguration.getCustomersByIdUrl(customerId);
    ProxyCustomer proxyCustomer = restTemplate.getForObject(url, ProxyCustomer.class);

    return convertCustomerProxy(proxyCustomer);
  }

  private Customer convertCustomerProxy(ProxyCustomer proxyCustomer) {
    Customer customer = Customer.newBuilder().withId(proxyCustomer.getId()).withLocation(proxyCustomer.getLocation())
        .withName(proxyCustomer.getName()).build();

    return customer;
  }

}
