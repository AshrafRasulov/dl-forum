package com.forum.forumnew.View.Request;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Builder
public class UserCreateRequest {
  private Long id;
  private String username;
  private String email;
  private String password;
  private String firstName;
  private String lastName;
  private String middleName;
  private Boolean status;
  private Boolean isAdmin;
}
