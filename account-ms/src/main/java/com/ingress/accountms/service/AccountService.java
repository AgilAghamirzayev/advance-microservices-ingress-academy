package com.ingress.accountms.service;

import com.ingress.accountms.client.UserClient;
import com.ingress.accountms.client.request.UserRequest;
import com.ingress.accountms.model.AccountRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static com.ingress.accountms.model.constants.CurrencyConstants.eligibleCurrencies;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AsyncService asyncService;

    public void validateAccount(AccountRequest accountRequest) {
        if (!eligibleCurrencies.contains(accountRequest.getCurrency())) {
            throw new RuntimeException("Not eligible currency");
        }

        asyncService.saveUser();
    }


}
