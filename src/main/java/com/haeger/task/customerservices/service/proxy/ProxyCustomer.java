package com.haeger.task.customerservices.service.proxy;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "customer")
public class ProxyCustomer {

  @XmlElement
  private String id;
  @XmlElement
  private String name;
  @XmlElement
  private String location;

  ProxyCustomer() {

  }

  private ProxyCustomer(Builder builder) {
    id = builder.id;
    name = builder.name;
    location = builder.location;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getLocation() {
    return location;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static final class Builder {
    private String id;
    private String name;
    private String location;

    private Builder() {
    }

    public Builder withId(String val) {
      id = val;
      return this;
    }

    public Builder withName(String val) {
      name = val;
      return this;
    }

    public Builder withLocation(String val) {
      location = val;
      return this;
    }

    public ProxyCustomer build() {
      return new ProxyCustomer(this);
    }
  }
}
