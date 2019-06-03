package com.ibanity.apis.client.products.xs2a.sandbox.services.impl;

import com.ibanity.apis.client.http.IbanityHttpClient;
import com.ibanity.apis.client.products.xs2a.sandbox.services.FinancialInstitutionAccountsService;
import com.ibanity.apis.client.products.xs2a.sandbox.services.FinancialInstitutionTransactionsService;
import com.ibanity.apis.client.products.xs2a.sandbox.services.FinancialInstitutionUsersService;
import com.ibanity.apis.client.products.xs2a.sandbox.services.SandboxFinancialInstitutionsService;
import com.ibanity.apis.client.products.xs2a.sandbox.services.SandboxService;
import com.ibanity.apis.client.services.ApiUrlProvider;

public class SandboxServiceImpl implements SandboxService {

    private final FinancialInstitutionUsersService financialInstitutionUsersService;
    private final FinancialInstitutionAccountsService financialInstitutionAccountsService;
    private final SandboxFinancialInstitutionsService sandboxFinancialInstitutionsService;
    private final FinancialInstitutionTransactionsService financialInstitutionTransactionsService;

    public SandboxServiceImpl(ApiUrlProvider apiUrlProvider, IbanityHttpClient ibanityHttpClient) {
        financialInstitutionUsersService = new FinancialInstitutionUsersServiceImpl(apiUrlProvider, ibanityHttpClient);
        sandboxFinancialInstitutionsService = new SandboxFinancialInstitutionsServiceImpl(apiUrlProvider, ibanityHttpClient);
        financialInstitutionAccountsService = new FinancialInstitutionAccountsServiceImpl(apiUrlProvider, ibanityHttpClient);
        financialInstitutionTransactionsService = new FinancialInstitutionTransactionsServiceImpl(apiUrlProvider, ibanityHttpClient);
    }

    @Override
    public SandboxFinancialInstitutionsService sandboxFinancialInstitutionsService() {
        return sandboxFinancialInstitutionsService;
    }

    @Override
    public FinancialInstitutionUsersService financialInstitutionUsersService() {
        return financialInstitutionUsersService;
    }

    @Override
    public FinancialInstitutionAccountsService financialInstitutionAccountsService() {
        return financialInstitutionAccountsService;
    }

    @Override
    public FinancialInstitutionTransactionsService financialInstitutionTransactionsService() {
        return financialInstitutionTransactionsService;
    }
}