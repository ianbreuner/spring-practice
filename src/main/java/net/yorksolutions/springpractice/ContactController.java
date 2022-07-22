package net.yorksolutions.springpractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Optional;

// a controller class in spring boot stores the functions that are run whe a client makes a fetch request
@RestController
@RequestMapping("/contacts")

public class ContactController {

    public ContactService service;

    @Autowired
    public ContactController(ContactService contactService) {
    this.service = contactService;
}
    //Create (C) part of crud
    @GetMapping("/add")
    public void addContact(@RequestParam String name, @RequestParam String phoneNumber) {
        System.out.println("add contact");
    }

    // Read (R) part of crud
    @GetMapping("/list")
    public Iterable<ContactEntity> listContacts() {
        return service.list();
        //write some code to do the work
    }
    @GetMapping("/get")
    public Optional<ContactEntity> getSpecificContact(@RequestParam Long id){
       return service.getSpecificContact(id);
        //write some code to return that person's data
    }

    // Update (U) part of crud
    @GetMapping("updatePhoneNumber")
    public void updateContact(@RequestParam String name, @RequestParam String newNumber){
        service.updatePhoneNumber(name, newNumber);
        // More code to do work
    }

    // Delete (D) part of crud
    @GetMapping("/delete")
    public void deleteContact(@RequestParam String name) {

    }
}
