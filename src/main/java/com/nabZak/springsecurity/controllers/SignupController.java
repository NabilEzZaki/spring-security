package com.nabZak.springsecurity.controllers;

import com.nabZak.springsecurity.dto.SignupRequest;
import com.nabZak.springsecurity.services.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/singup")
public class SignupController {
    private final AuthService authService;

    public AuthServiceImpl(AuthService authService) {
        this.authService = authService;
    }

    public ResponseEntity<String> signupCustomer(@RequestBody SignupRequest signupRequest){
        boolean isUserCreated = authService.createCustomer(signupRequest);
    }
}
