package com.example.demo.controllers;

import com.example.demo.domain.User;
import com.example.demo.services.VersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping(value="/demo")
public class Version {
    
    @Autowired
    VersionService vs;
    
    @RequestMapping(value="/users", method = GET, produces = "application/json")
    public List<User> getUsers(){
        System.out.println(new User("chris", "chris@email.com"));
       return vs.getUsers();
    }
    
    @RequestMapping(value="/version", method = RequestMethod.PUT, produces = "application/json")
    public String setVersion(@RequestParam("newVersion") int versionInput){
        return "vs: "+vs.setVersion(versionInput*2);
    }
}
