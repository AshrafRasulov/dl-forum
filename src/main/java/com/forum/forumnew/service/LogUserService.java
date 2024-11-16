package com.forum.forumnew.service;

import com.forum.forumnew.Model.LogUser;
import com.forum.forumnew.Utils.ActionEnum;
import com.forum.forumnew.View.LogUserResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
@AllArgsConstructor
public class LogUserService {

    public LogUserResponse LogUserData(){
        LogUser logUser = new LogUser();
        Timestamp created = new Timestamp(System.currentTimeMillis());

        logUser.setBody("This is body of Log User table");
        logUser.setAction(ActionEnum.VERYGOOD);
        logUser.setCreated(created);

        LogUserResponse response = LogUserResponse.builder()
                .id(logUser.getId())
                .created_by(logUser.getCreated_by())
                .user_id(logUser.getUser_id())
                .created(logUser.getCreated())
                .action(logUser.getAction())
                .body(logUser.getBody())
                .build();
        return response;
    }
}
