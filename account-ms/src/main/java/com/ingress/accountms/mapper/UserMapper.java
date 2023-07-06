package com.ingress.accountms.mapper;

import com.ingress.accountms.client.request.UserRequest;

public class UserMapper {
    public static UserRequest buildUserRequest() {
        return UserRequest.builder()
                .name("Ali")
                .email("ali@ingress.com")
                .age(21)
                .build();
    }
}
