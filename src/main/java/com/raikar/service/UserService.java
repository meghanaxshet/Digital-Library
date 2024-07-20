package com.raikar.service;

import com.raikar.dto.UserRequest;
import com.raikar.model.User;
import com.raikar.model.UserType;
import com.raikar.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User addStudent(UserRequest userRequest) {
      User user = userRequest.toStudent() ;
      user.setUserType(UserType.STUDENT);
      return userRepository.save(user);
    }
}
