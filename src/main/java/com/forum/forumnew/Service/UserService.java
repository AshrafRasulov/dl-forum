package com.forum.forumnew.Service;

import com.forum.forumnew.Model.User;
import com.forum.forumnew.Repository.UserRepository;
import com.forum.forumnew.View.DTO.UserDTO;
import com.forum.forumnew.View.Request.UserCreateRequest;
import com.forum.forumnew.View.Response.ListUserResponse;
import com.forum.forumnew.View.Response.UserResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserService {
  private final UserRepository repository;

  public UserResponse ServIt(UserCreateRequest userRequest) {
    User user = new User();
    if (userRequest.getId() != null)
      user.setId(userRequest.getId());


    user.setUsername(userRequest.getUsername());
    user.setEmail(userRequest.getEmail());
    user.setIsAdmin(userRequest.getIsAdmin());
    user.setPassword(userRequest.getPassword());
    user.setFirstName(userRequest.getFirstName());
    user.setLastName(userRequest.getLastName());
    user.setMiddleName(userRequest.getMiddleName());
    user.setStatus(userRequest.getStatus());


    repository.save(user);
    UserDTO dto = UserDTO.builder()
        .id(user.getId())
        .username(user.getUsername())
        .email(user.getEmail())
        .password(user.getPassword())
        .firstName(user.getFirstName())
        .lastName(user.getLastName())
        .middleName(user.getMiddleName())
        .created(user.getCreated())
        .status(user.getStatus())
        .isAdmin(user.getIsAdmin())
        .build();

    UserResponse response = UserResponse.builder()
        .user(dto)
        .success(true)
        .build();
    return response;
  }

  public UserResponse getUserById(long id) {
    User user = new User();

    User defaultUser = new User(); // Create or define a default user
    user = repository.findById(id)
        .orElse(defaultUser);
    UserDTO dto = UserDTO.builder()
        .id(user.getId())
        .username(user.getUsername())
        .email(user.getEmail())
        .password(user.getPassword())
        .firstName(user.getFirstName())
        .lastName(user.getLastName())
        .middleName(user.getMiddleName())
        .created(user.getCreated())
        .status(user.getStatus())
        .isAdmin(user.getIsAdmin())
        .build();
    boolean userExists = user.getId() != null;

    return UserResponse.builder()
        .user(dto)
        .success(userExists)
        .message(userExists ? "success" : "user not found")
        .build();
  }


  public ListUserResponse getAllUsers() {
    try {
      List<User> users = repository.findAll();
      List<UserDTO> useDTOS = users.stream()
          .map(user -> UserDTO.builder()  // Assuming UserDTO has a builder pattern
              .id(user.getId())
              .username(user.getUsername())
              .email(user.getEmail())
              .build())
          .toList();

      return ListUserResponse.builder()
          .users(useDTOS)
          .message("success")
          .success(true)
          .build();
    } catch (Exception e) {
      return ListUserResponse.builder()
          .message(e.getMessage())
          .success(false)
          .build();
    }
  }
}
