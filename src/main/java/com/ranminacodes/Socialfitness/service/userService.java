package com.ranminacodes.Socialfitness.service;

import com.ranminacodes.Socialfitness.dto.UserDto;
import com.ranminacodes.Socialfitness.model.users;

import java.util.List;

public interface userService {
//    public users saveUser(users user);
    public List<users> getAllUsers();

    String saveUser(UserDto userDto);
}
