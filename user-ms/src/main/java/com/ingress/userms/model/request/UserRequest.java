package com.ingress.userms.model.request;

import lombok.Data;

@Data
public class UserRequest {
    private String name;
    private String email;
    private Integer age;
}
