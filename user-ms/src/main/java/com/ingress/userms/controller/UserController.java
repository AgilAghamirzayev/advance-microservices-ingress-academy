package com.ingress.userms.controller;

import com.ingress.userms.model.criteria.PageCriteria;
import com.ingress.userms.model.criteria.UserCriteria;
import com.ingress.userms.model.request.UserRequest;
import com.ingress.userms.model.response.PageableUserResponse;
import com.ingress.userms.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/users")
public class UserController {

    private final UserService userService;


    @PostMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void saveUser(@RequestBody UserRequest userRequest){
        userService.saveUser(userRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public PageableUserResponse getUsers(PageCriteria pageCriteria, UserCriteria userCriteria) {

        return userService.getUsers(pageCriteria, userCriteria);

    }
}
