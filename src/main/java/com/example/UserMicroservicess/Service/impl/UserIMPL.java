package com.example.UserMicroservicess.Service.impl;

import com.example.UserMicroservicess.Dto.UserDto;
import com.example.UserMicroservicess.Entity.User;
import com.example.UserMicroservicess.Repo.UserRepo;
import com.example.UserMicroservicess.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserIMPL implements UserService {
    @Autowired
    private UserRepo userRepo;
    @Override
    public String addUser(UserDto userDto) {
        User user= new User(

                userDto.getUserid(),
                userDto.getUsername(),
                userDto.getAddress(),
                userDto.getMobile()
        );
        userRepo.save(user);

        return  user.getUsername();
    }

    @Override
    public Object getAllUser() {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public User getUserById(Long id) {
        return null;
    }

    @Override
    public User updateUser(Long id, User user) {
        return null;
    }
}
