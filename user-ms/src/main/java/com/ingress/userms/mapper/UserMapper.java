package com.ingress.userms.mapper;

import com.ingress.userms.entity.UserEntity;
import com.ingress.userms.model.response.UserResponse;

public class UserMapper {
    public static UserResponse mapEntityToResponse(UserEntity userEntity) {
        UserResponse userResponse = new UserResponse();
        userResponse.setId(userEntity.getId());
        userResponse.setName(userEntity.getName());
        userResponse.setEmail(userEntity.getEmail());
        userResponse.setAge(userEntity.getAge());
        return userResponse;
    }
}
