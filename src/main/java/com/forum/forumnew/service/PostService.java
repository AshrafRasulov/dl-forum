package com.forum.forumnew.service;

import com.forum.forumnew.Model.Post;
import com.forum.forumnew.View.PostResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.sql.Timestamp;

@Service
@AllArgsConstructor
public class PostService {

    public PostResponse Boo(){
        Post post = new Post();

        Timestamp created = new Timestamp(System.currentTimeMillis());

        post.setTitle("soska");
        post.setCreated(created);

        PostResponse response = PostResponse.builder()
            .id(post.getId())
            .user_id(post.getAuthor().getId())
            .title(post.getTitle())
            .content(post.getContent())
            .created(post.getCreated())
            .category_id(post.getCategory_id())
            .status(post.getStatus())
            .build();

        return response;
    }
}
