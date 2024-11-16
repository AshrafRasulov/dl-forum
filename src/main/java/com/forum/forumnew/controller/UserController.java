package com.forum.forumnew.controller;


import com.forum.forumnew.View.UserResponse;
import com.forum.forumnew.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@AllArgsConstructor
@RequestMapping("user/")
public class UserController {
    private UserService userService;


    @GetMapping("you")
    public UserResponse userIt(){
        return userService.ServIt();
    }
}
