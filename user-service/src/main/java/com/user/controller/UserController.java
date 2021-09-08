package com.user.controller;

import com.user.entity.User;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static java.util.Objects.isNull;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{userId}")
    public User getUserDetails(@PathVariable("userId") Long userId){
        User user =  this.userService.getUser(userId);

        if(isNull(user)){
            return null;
        }
        List contactList = restTemplate.getForObject("lb://contact-service/contact/"+user.getUserId(),List.class);
        user.setContactList(contactList);
        return user;
    }
}
