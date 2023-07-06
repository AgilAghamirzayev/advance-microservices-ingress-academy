package com.ingress.accountms.client;

import com.ingress.accountms.client.request.UserRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Profile(value = "default")
@FeignClient(name = "ms-users", url = "${client.urls.user-ms}")
public interface UserClient {

    @PostMapping("/v1/users")
    void saveUser(@RequestBody UserRequest userRequest);
}
