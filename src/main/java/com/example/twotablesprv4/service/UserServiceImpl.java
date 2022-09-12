package com.example.twotablesprv4.service;

import com.example.twotablesprv4.dto.UserRequest;
import com.example.twotablesprv4.entity.User;
import com.example.twotablesprv4.exeption.UserNotFoundException;
import com.example.twotablesprv4.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(UserRequest userRequest) {
        User user = User
                .build(0, userRequest.getName(), userRequest.getEmail(),
                        userRequest.getMobile(), userRequest.getGender(),
                        userRequest.getAge(), userRequest.getNationality());
        return userRepository.save(user);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User findUserById(int id) throws UserNotFoundException {
        User user = userRepository.findUserById(id);
        if (user != null){
            return user;
        }else {
            throw new UserNotFoundException("user not found with id: "+id);
        }
    }
}
