package net.yorksolutions.springpractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ContactService {

    ContactRepository repository;

    @Autowired
    public ContactService(ContactRepository repository){
        this.repository = repository;
    }

    public void create(String name, String phoneNumber){
        //add the new contact to the database
        ContactEntity contact = new ContactEntity(name, phoneNumber);
        repository.save(contact);
    }

    public Iterable<ContactEntity> list() {
        return repository.findAll();
        //
    }

    public Optional<ContactEntity> getSpecificContact (Long id) {
        return repository.findById(id);
    }
    public void updatePhoneNumber (String name, String phoneNumber){

    }
}
