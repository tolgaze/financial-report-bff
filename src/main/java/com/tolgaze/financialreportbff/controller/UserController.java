package com.tolgaze.financialreportbff.controller;

import java.util.concurrent.ExecutionException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tolgaze.financialreportbff.model.entity.UserData;
import com.tolgaze.financialreportbff.service.user.UserService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user-data")
public class UserController {
  private final UserService userService;

  UserController(UserService userService){
    this.userService = userService;
  }
  
  @GetMapping
  ResponseEntity<UserData> getUserData(HttpServletRequest request) throws InterruptedException, ExecutionException {
    String userEmail = (String) request.getAttribute("userEmail");
    UserData userData = userService.getUserData(userEmail);
    
    return new ResponseEntity<>(userData, HttpStatus.OK);
  }

  @PostMapping
  ResponseEntity<Void> updateUserData(@RequestBody UserData userData, HttpServletRequest request) throws InterruptedException, ExecutionException {
    String userEmail = (String) request.getAttribute("userEmail");
    userService.updateUserData(userEmail, userData);
    
    return new ResponseEntity<Void>(HttpStatus.OK);
  }
}
