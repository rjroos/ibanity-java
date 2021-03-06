package com.ibanity.samples.customer;

import com.ibanity.apis.client.products.xs2a.models.CustomerAccessToken;
import com.ibanity.apis.client.products.xs2a.models.create.CustomerAccessTokenCreationQuery;
import com.ibanity.apis.client.products.xs2a.services.CustomerAccessTokensService;
import com.ibanity.apis.client.services.IbanityService;

public class CustomerAccessTokenSample {

    private final CustomerAccessTokensService customerAccessTokensService;

    public CustomerAccessTokenSample(IbanityService ibanityService) {
        customerAccessTokensService = ibanityService.xs2aService().customerAccessTokensService();
    }

    public CustomerAccessToken create(String consentReference) {
        CustomerAccessTokenCreationQuery customerAccessTokenCreationQuery =
                CustomerAccessTokenCreationQuery.builder().applicationCustomerReference(consentReference).build();

        return customerAccessTokensService.create(customerAccessTokenCreationQuery);
    }
}
