package com.ranminacodes.Socialfitness.controller;

import com.ranminacodes.Socialfitness.dto.UserDto;
import com.ranminacodes.Socialfitness.model.users;
import com.ranminacodes.Socialfitness.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class userController {
    @Autowired
    private userService usersService;

    @PostMapping("/add")
    public String addUser(@RequestBody UserDto userDto) {
//        usersService.saveUser(user);
//        return "New user added";

        String id= usersService.saveUser(userDto);
        return id;
    }


    @GetMapping("/getall")
    public List<users> getAllUsers() {
        return usersService.getAllUsers();
    }
}
