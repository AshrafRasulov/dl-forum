package com.forum.forumnew.controller;


import com.forum.forumnew.View.LogUserResponse;
import com.forum.forumnew.service.LogUserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@AllArgsConstructor
@RequestMapping("loguser/")
public class LogUserController {
    LogUserService logUserService;

    @GetMapping("logusersome")
    public LogUserResponse ActiveIndex(){
        return logUserService.LogUserData();
    }
}
