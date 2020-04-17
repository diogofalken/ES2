package com.repository;

import com.customer.Customer;

public interface ICustomerRepository {
    public Customer getCustomerByEmail(String s);

    public void save(Customer customer);
}
