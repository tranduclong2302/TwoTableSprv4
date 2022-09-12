package com.example.twotablesprv4.service;

import com.example.twotablesprv4.dto.UserRequest;
import com.example.twotablesprv4.entity.User;
import com.example.twotablesprv4.exeption.UserNotFoundException;
import com.example.twotablesprv4.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface IUserService {
    User save(UserRequest userRequest);

    List<User> getAll();

    User findUserById(int id) throws UserNotFoundException;
}
