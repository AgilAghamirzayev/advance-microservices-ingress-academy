package com.ingress.userms.entity;

import lombok.Data;

@Data
public class UserEntity {
    private Long id;
    private String name;
    private String email;
    private Integer age;
}
