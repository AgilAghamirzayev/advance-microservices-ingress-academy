package com.ingress.accountms.service;

import com.ingress.accountms.client.UserClient;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import static com.ingress.accountms.mapper.UserMapper.buildUserRequest;

@Service
@RequiredArgsConstructor
public class AsyncService {

    private final UserClient userClient;

    @Async
    public void saveUser() {
        userClient.saveUser(buildUserRequest());
    }

}
