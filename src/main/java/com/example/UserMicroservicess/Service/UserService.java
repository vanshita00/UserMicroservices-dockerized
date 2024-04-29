package com.example.UserMicroservicess.Service;

import com.example.UserMicroservicess.Dto.UserDto;
import com.example.UserMicroservicess.Entity.User;

public interface UserService {
    String addUser(UserDto userDto);

    Object getAllUser();

    void deleteUser(Long id);

    User getUserById(Long id);

    User updateUser(Long id, User user);
}
