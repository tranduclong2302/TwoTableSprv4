package com.example.twotablesprv4.controller;

import com.example.twotablesprv4.dto.UserRequest;
import com.example.twotablesprv4.entity.User;
import com.example.twotablesprv4.exeption.UserNotFoundException;
import com.example.twotablesprv4.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @Autowired
    private IUserService userService;

    @PostMapping("/sign-up")
    public ResponseEntity<User> save(@RequestBody @Valid UserRequest userRequest){
        return new ResponseEntity<>(userService.save(userRequest), HttpStatus.CREATED);
    }

//    @GetMapping("/allUsers")
//    public ResponseEntity<List<User>> getAllUsers(){
//        return ResponseEntity.ok(userService.getAll());
//    }
    @GetMapping("/allUsers")
    public List<User> getAllUsers(){
        return userService.getAll();
    }

    @GetMapping("{id}")
    public ResponseEntity<User> getUser(@PathVariable("id") int id) throws UserNotFoundException {
        return ResponseEntity.ok(userService.findUserById(id));
    }
}
