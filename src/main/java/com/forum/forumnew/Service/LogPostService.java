package com.forum.forumnew.Service;

import com.forum.forumnew.Model.LogPost;
import com.forum.forumnew.Utils.ActionEnum;
import com.forum.forumnew.View.Response.LogPostResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
@AllArgsConstructor
public class LogPostService {

    public LogPostResponse LogPostData(){
        LogPost logPost = new LogPost();
        Timestamp created = new Timestamp(System.currentTimeMillis());

        logPost.setBody("This is body of Log Post table");
        logPost.setAction(ActionEnum.GOOD);
        logPost.setCreated(created);

        LogPostResponse response = LogPostResponse.builder()
                .id(logPost.getId())
                .created_by(logPost.getCreated_by())
                .post_id(logPost.getPost_id())
                .created(logPost.getCreated())
                .action(logPost.getAction())
                .body(logPost.getBody())
                .build();

        return response;
    }
}
