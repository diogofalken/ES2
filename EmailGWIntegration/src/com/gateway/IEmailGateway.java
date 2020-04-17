package com.gateway;

import com.customer.Customer;

public interface IEmailGateway {
    public void sendSpecialGreetings(Customer customer);
    public void sendRegularGreetings(Customer customer);
}
