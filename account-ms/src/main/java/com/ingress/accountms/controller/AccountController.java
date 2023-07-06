package com.ingress.accountms.controller;

import com.ingress.accountms.model.AccountRequest;
import com.ingress.accountms.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/accounts")
public class AccountController {

    private final AccountService accountService;
    @PostMapping("/validate")
    public void validateAccount(@RequestBody AccountRequest accountRequest) {
        accountService.validateAccount(accountRequest);
    }
}
