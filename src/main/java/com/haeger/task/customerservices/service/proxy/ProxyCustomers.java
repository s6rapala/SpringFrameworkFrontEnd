package com.haeger.task.customerservices.service.proxy;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "customers")
public class ProxyCustomers {

  @XmlElement(name = "customer")
  private List<ProxyCustomer> customerList;

  public List<ProxyCustomer> getCustomerList() {
    return customerList;
  }
}
