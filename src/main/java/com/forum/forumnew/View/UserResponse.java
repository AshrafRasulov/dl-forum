package com.forum.forumnew.View;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Builder
public class UserResponse {

    private Long id;
    private String username;
    private String email;
    private String password;
    private String first_name;
    private String last_name;
    private String middle_name;
    private Timestamp created;
    private Boolean status;
    private Boolean is_admin;
}
