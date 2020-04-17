package com.repository;

import com.customer.Customer;

import java.io.*;
import java.util.HashMap;

public class Repository implements ICustomerRepository {
    public final HashMap<String,Customer> repository = new HashMap();


    @Override
    public Customer getCustomerByEmail(String email) {
        if(repository.containsKey(email))
            return repository.get(email);

        return null;
    }

    @Override
    public void save(Customer customer) {

        this.repository.put(customer.getEmail(),customer);
    }
}
