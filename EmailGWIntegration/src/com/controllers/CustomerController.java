package com.controllers;

import com.customer.*;
import com.gateway.IEmailGateway;
import com.http.HttpResponseMessage;
import com.repository.ICustomerRepository;

public class CustomerController {
    private ICustomerRepository repository;
    private IEmailGateway emailGateway;

    public CustomerController(ICustomerRepository repository,
                              IEmailGateway emailGateway) {
        this.repository = repository;
        this.emailGateway = emailGateway;
    }

    public HttpResponseMessage createCustomer(String name, String email, String city)
    {
        Customer existingCustomer = repository.getCustomerByEmail(email);

        if (existingCustomer != null)
            return new HttpResponseMessage(301, "Customer with such email address already exists");

        Customer customer = new Customer(name, email, city);

        repository.save(customer);

        if (city.equals("Odense"))
        {
            emailGateway.sendSpecialGreetings(customer);
        }else{
            emailGateway.sendRegularGreetings(customer);
        }

        return new HttpResponseMessage(200, "OK");
    }
}
