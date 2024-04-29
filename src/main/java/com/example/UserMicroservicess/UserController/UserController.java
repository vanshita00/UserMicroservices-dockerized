package com.example.UserMicroservicess.UserController;

import com.example.UserMicroservicess.Dto.UserDto;
import com.example.UserMicroservicess.Entity.User;
import com.example.UserMicroservicess.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping(path="/user")
    public String saveUser(@RequestBody UserDto userDto)
    {
        String id= userService.addUser(userDto);
        return id;
    }
    @GetMapping("/users")
    public List<User> getAllUsers(){
        return (List<User>) userService.getAllUser();
    }

    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User>  getUserById(@PathVariable Long id){
        User user = userService.getUserById(id);
        if(user == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(user);
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id,@RequestBody User user){
        User updatedUser = userService.updateUser(id, user);
        if(updatedUser==null)
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        return ResponseEntity.ok(updatedUser);
    }

}
