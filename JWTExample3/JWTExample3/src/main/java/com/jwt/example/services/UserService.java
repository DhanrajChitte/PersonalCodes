package com.jwt.example.services;


import com.jwt.example.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store=new ArrayList<>();

    // Create the default constructor
    public UserService(){
        // Generate the user ID randomly
        store.add(new User(UUID.randomUUID().toString(),"Dhanraj Chitte","chittedhanraj3@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Dhanraj Chitte1","chittedhanraj4@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Dhanraj Chitte2","chittedhanraj5@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Dhanraj Chitte3","chittedhanraj6@gmail.com"));
    }

    public List<User> getUsers()

    {
        return this.store;
    }

}
