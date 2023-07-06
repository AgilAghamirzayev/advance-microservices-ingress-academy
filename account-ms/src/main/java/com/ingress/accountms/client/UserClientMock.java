package com.ingress.accountms.client;

import com.ingress.accountms.client.request.UserRequest;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("!default")
//@Profile("dev")
public class UserClientMock implements UserClient {

    @Override
    public void saveUser(UserRequest userRequest) {
        System.out.println("This is mock request");
    }
}
