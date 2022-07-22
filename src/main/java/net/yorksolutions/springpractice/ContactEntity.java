package net.yorksolutions.springpractice;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ContactEntity {

    @Id
            @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    @JsonProperty
    String name;
    @JsonProperty
    String phoneNumber;

    public ContactEntity(){}
    public ContactEntity(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }


}
