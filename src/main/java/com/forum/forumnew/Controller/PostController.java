package com.forum.forumnew.Controller;

import com.forum.forumnew.View.Response.PostResponse;
import com.forum.forumnew.Service.PostService;
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
