package com.example.demo.dao;

import com.example.demo.domain.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class VersionDao implements VersionMapper{




    @Override
    public List<User> getUsers() {
        List<User> userList = new ArrayList<>();
        userList.add(new User( "Andrew", "andrew@email.com"));
        userList.add(new User( "Richard", "richard@email.com"));
        userList.add(new User( "Susie", "susie@email.com"));
        userList.add(new User( "Kris", "kris@email.com"));
        userList.add(new User( "Frank", "frank@email.com"));
        userList.add(new User( "Jim", "jim@email.com"));
        return userList;
    }

}
