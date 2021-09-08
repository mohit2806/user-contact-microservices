package com.user.service;

import com.user.entity.Contact;
import com.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

   List<User> userList = Arrays.asList(
            new User(100L,"Ram","99999"),
            new User(101L,"Sham","88888")
    );

    @Override
    public User getUser(Long id) {
        return userList.stream()
                .filter(user -> user.getUserId().equals(id))
                .findAny().orElse(null);
    }
}
