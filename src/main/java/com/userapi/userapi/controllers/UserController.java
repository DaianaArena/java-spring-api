package com.userapi.userapi.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.userapi.userapi.models.User;
import com.userapi.userapi.services.UserService;

@RestController
@RequestMapping("user")

public class UserController {

    @Autowired
    UserService userService;
    
    //GET ALL USERS
    @RequestMapping(value = "/", method = RequestMethod.GET)
    List<User> getALL(){
        
        return userService.getALL();
    }

     //GET USER BY ID
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    User get(@PathVariable long id){
        
       return userService.get(id);
    }

    //POST USER
    @RequestMapping(value = "/", method = RequestMethod.POST)
    User register(@RequestBody User user){
        
        
        return userService.register(user);
    }

    //UPDATE USER
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    User update(@RequestBody User user){
        
        
        return userService.update(user);
    }

    //DELETE USER
     @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    void delete(@PathVariable long id){
        
        userService.delete(id);
        
    }
}

