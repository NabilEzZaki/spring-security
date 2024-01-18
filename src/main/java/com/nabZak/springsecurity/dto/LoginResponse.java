package com.nabZak.springsecurity.dto;

public class LoginResponse {
    private String jwtToken;

    public LoginResponse(String jwtToken) {
        this.jwtToken = jwtToken;
    }

//    public void setJwtToken(String jwtToken) {
//        this.jwtToken = jwtToken;
//    }

    public String getJwtToken() {
        return jwtToken;
    }
}
