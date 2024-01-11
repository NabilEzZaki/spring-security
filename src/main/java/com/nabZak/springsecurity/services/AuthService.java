package com.nabZak.springsecurity.services;

import com.nabZak.springsecurity.dto.SignupRequest;

public interface AuthService {
    boolean createCustomer(SignupRequest signupRequest);
}
