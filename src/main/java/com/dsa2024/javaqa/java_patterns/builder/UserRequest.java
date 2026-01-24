package com.dsa2024.javaqa.java_patterns.builder;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter @Setter
public class UserRequest {
    private String username;
    private String email;
    private String phone;
    private String address;

    public static void main(String[] args) {
        UserRequest request = UserRequest.builder()
        .username("bhanu")
        .email("bhanu@gmail.com")
        .build();
        System.out.println(request.getUsername());
    }
}

