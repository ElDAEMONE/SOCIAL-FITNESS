package com.ranminacodes.Socialfitness.service;

import com.ranminacodes.Socialfitness.dto.UserDto;
import com.ranminacodes.Socialfitness.model.users;
import com.ranminacodes.Socialfitness.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userServiceImplementation implements userService {
    @Autowired
    private userRepository userRepository;

//    @Override
//    public users saveUser(users user) {
//        return userRepository.save(user);
//    }

    @Override
    public List<users> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public String saveUser(UserDto userDto) {
        users user = new users(
                userDto.getId(),
                userDto.getName(),
                userDto.getEmail(),
                userDto.getPassword(),
                userDto.getAge(),
                userDto.getGender()
        );

        userRepository.save(user);

        return user.getName();

    }
}
