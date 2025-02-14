package com.neoteric.springJWT.controller;

import com.neoteric.springJWT.model.Users;
import com.neoteric.springJWT.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Users register(@RequestBody Users user){

         return userService.register(user);

    }

    @PostMapping("/login")
     public String login(@RequestBody Users user){
        System.out.println(user);
        return  userService.verify(user);

       // return "Sucess";
     }


}
