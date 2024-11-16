package com.forum.forumnew.service;

import com.forum.forumnew.Model.User;
import com.forum.forumnew.View.UserResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    public UserResponse ServIt(){
        User user = new User();

        user.setUsername("User Soska");

        UserResponse response = UserResponse.builder()
            .id(user.getId())
            .username(user.getUsername())
            .email(user.getEmail())
            .password(user.getPassword())
            .first_name(user.getFirst_name())
            .last_name(user.getLast_name())
            .middle_name(user.getMiddle_name())
            .created(user.getCreated())
            .status(user.getStatus())
            .is_admin(user.getIs_admin())
            .build();

        return  response;
    }
}
