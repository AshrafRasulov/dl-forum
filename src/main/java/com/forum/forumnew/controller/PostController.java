package com.forum.forumnew.controller;

import com.forum.forumnew.View.PostResponse;
import com.forum.forumnew.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@CrossOrigin
@AllArgsConstructor //annotation
@RequestMapping("post/")
public class PostController {
    private PostService postService;
    @GetMapping("boo")
    public PostResponse HelloWorld(){
        return postService.Boo();
    }
}
