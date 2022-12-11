package com.example.RentABook.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService studentService) {
        this.userService = studentService;
    }

    @PostMapping()
    public void addNewUser(@RequestBody Users user) {
        userService.addNewUser(user);
    }

}
