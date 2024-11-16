package com.forum.forumnew.View.Response;

import com.forum.forumnew.View.DTO.UserDTO;
import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Builder
public class UserResponse {
    private boolean success;
    private String message;
    private UserDTO user;
}
