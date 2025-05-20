package com.manthan.portfolio.service;

import com.manthan.portfolio.model.ContactMessage;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
    public String handleMessage(ContactMessage msg) {
        // Save to DB or email logic can go here
        System.out.println("Received contact from: " + msg.getName());
        return "Message received. Thank you!";
    }
}
