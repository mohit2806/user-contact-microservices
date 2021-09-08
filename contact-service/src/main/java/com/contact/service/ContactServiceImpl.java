package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl {

    List<Contact> contactList = Arrays.asList(
            new Contact(1101L, "abc@gmail.com", "India",100L),
            new Contact(1102L, "xyz@gmail.com", "USA",100L),
            new Contact(1103L, "abc@gmail.com", "Cyprus",101L)
    );


    public List<Contact> getContact( Long id) {
        return contactList.stream().filter( contact -> contact.getUserId().equals(id))
                .collect(Collectors.toList());
    }
}
