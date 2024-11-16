package com.forum.forumnew.controller;


import com.forum.forumnew.View.LogPostResponse;
import com.forum.forumnew.service.LogPostService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@AllArgsConstructor
@RequestMapping("logpost/")
public class LogPostController {
    LogPostService logPostService;

    @GetMapping("watchlogpost")
    public LogPostResponse ActiveIndex(){
        return logPostService.LogPostData();
    }

}
