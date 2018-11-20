package com.haeger.task.customerservices.service.proxy;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

@Component
public class RestCustomerProxyConfiguration {
  private String baseUrl;

  @Autowired
  public RestCustomerProxyConfiguration(@Value("${customerService.baseUrl}") String baseUrl) {
    this.baseUrl = baseUrl;
  }

  public String getCustomersByIdUrl(String customerId) {
    return UriComponentsBuilder
        .fromHttpUrl(baseUrl + "/" + customerId)
        .build()
        .toUriString();
  }

  public String getCustomersUrl() {
    return UriComponentsBuilder
        .fromHttpUrl(baseUrl)
        .build()
        .toUriString();
  }
}
