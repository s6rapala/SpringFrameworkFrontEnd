package com.haeger.task.customerservices.controller;

import com.haeger.task.customerservices.service.Customer;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name="customers")
public class Customers {
  @XmlElement(name = "customer")
  List<Customer> customerList;

  Customers() {

  }

  Customers(List<Customer> customerList) {
    this.customerList = customerList;
  }

  public List<Customer> getCustomerList() {
    return customerList;
  }
}

