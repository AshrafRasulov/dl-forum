package com.forum.forumnew.Controller;

import com.forum.forumnew.Model.User;
import com.forum.forumnew.View.Request.UserCreateRequest;
import com.forum.forumnew.View.Response.ListUserResponse;
import com.forum.forumnew.View.Response.UserResponse;
import com.forum.forumnew.Service.UserService;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import org.apache.catalina.users.GenericUser;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@AllArgsConstructor
@RequestMapping("user/")
public class UserController {
  private UserService userService;


  @PostMapping(value = "adduser")
  public UserResponse AddUser(@RequestBody UserCreateRequest userRequest) {
    return userService.AddNewUser(userRequest);
  }

  @GetMapping("{id}")
  public UserResponse getUserById(@PathVariable("id") Long id) {
    return userService.getUserById(id);
  }

  @GetMapping("all")
  public ListUserResponse getAllUsersa(){
    return userService.getAllUsers();
  }

  @DeleteMapping("/remove/{id}")
  public String deleteUserById(@PathVariable Long id) {
    String info;
    info = userService.deleteUserById(id);
    return info;
  }

}
