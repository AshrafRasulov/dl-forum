package com.forum.forumnew.Controller;

import com.forum.forumnew.View.Response.MessageResponse;
import com.forum.forumnew.Service.MessageService;
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
