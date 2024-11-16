package com.forum.forumnew.View.DTO;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Builder
public class UserDTO {
  private Long id;
  private String username;
  private String email;
  private String password;
  private String firstName;
  private String lastName;
  private String middleName;
  private Timestamp created;
  private Boolean status;
  private Boolean isAdmin;
}
