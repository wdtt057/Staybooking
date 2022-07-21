package com.example.staybooking.service;

import com.example.staybooking.exception.UserAlreadyExistException;
import com.example.staybooking.model.Authority;
import com.example.staybooking.model.User;
import com.example.staybooking.model.UserRole;
import com.example.staybooking.repository.AuthorityRepository;
import com.example.staybooking.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

public class RegisterService {
    private AuthorityRepository authorityRepository;
    private UserRepository userRepository;

    @Autowired
    public RegisterService(AuthorityRepository authorityRepository, UserRepository userRepository) {
        this.authorityRepository = authorityRepository;
        this.userRepository = userRepository;
    }

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public void add(User user, UserRole role) throws UserAlreadyExistException {
        if (userRepository.existsById(user.getUsername())){
            throw new UserAlreadyExistException("User already exist");
        }
        userRepository.save(user);
        authorityRepository.save(new Authority(user.getUsername(), role.name()));
    }
}
