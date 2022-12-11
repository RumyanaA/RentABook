package com.example.RentABook.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public void addNewUser(Users user){
        // handle exception when email exists
        userRepository.save(user);
    }
}
