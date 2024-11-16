package com.forum.forumnew.View.Response;

import com.forum.forumnew.View.DTO.UserDTO;
import lombok.Builder;
import lombok.Data;

import java.util.List;


@Data
@Builder
public class ListUserResponse {
  private boolean success;
  private String message;
  private List<UserDTO> users;
}
