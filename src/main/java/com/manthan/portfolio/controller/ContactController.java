package com.manthan.portfolio.controller;

import com.manthan.portfolio.model.ContactMessage;
import com.manthan.portfolio.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "*")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @PostMapping
    public String submitContact(@RequestBody ContactMessage message) {
        return contactService.handleMessage(message);
    }
}
