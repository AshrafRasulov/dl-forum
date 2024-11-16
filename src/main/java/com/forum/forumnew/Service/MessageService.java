package com.forum.forumnew.Service;

import com.forum.forumnew.Model.Message;
import com.forum.forumnew.View.Response.MessageResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.sql.Timestamp;


@Service
@AllArgsConstructor
public class MessageService {

    public MessageResponse sendMessage(){
        Message message = new Message();

        Timestamp created = new Timestamp(System.currentTimeMillis());

        message.setContent("Ты Пиздюк");
        message.setCreated(created);

        MessageResponse response = MessageResponse.builder()
                .id(message.getId())
                .user_id(message.getUser_id())
                .post_id(message.getUser_id())
                .content(message.getContent())
                .created(message.getCreated())
                .status(message.getStatus())
                .build();

        return response;
    }


}
