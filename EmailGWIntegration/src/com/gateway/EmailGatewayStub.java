package com.gateway;

import com.customer.Customer;

import java.util.ArrayList;

public class EmailGatewayStub implements IEmailGateway {
    static ArrayList<String> messagesSent = new ArrayList<>();

    @Override
    public void sendSpecialGreetings(Customer customer) {
        messagesSent.add(customer.getName());
    }

    @Override
    public void sendRegularGreetings(Customer customer) {
        messagesSent.add(customer.getName());
    }

    public static int getSentEmails() {
        return messagesSent.size();
    }

    public static ArrayList<String> getMessagesSent() {
       return messagesSent;
    }
}

