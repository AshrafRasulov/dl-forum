package com.forum.forumnew.controller;

import com.forum.forumnew.View.MessageResponse;
import com.forum.forumnew.service.MessageService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@CrossOrigin
@AllArgsConstructor
@RequestMapping("message/")
public class MessageController {
    private MessageService messageService;

    @GetMapping("yoopiii")
    public MessageResponse messageIt(){
        return messageService.sendMessage();
    }
}
