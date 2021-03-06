package com.ibanity.apis.client.products.ponto_connect.services;

import com.ibanity.apis.client.models.IbanityCollection;
import com.ibanity.apis.client.products.ponto_connect.models.FinancialInstitution;
import com.ibanity.apis.client.products.ponto_connect.models.read.FinancialInstitutionReadQuery;
import com.ibanity.apis.client.products.ponto_connect.models.read.FinancialInstitutionsReadQuery;
import com.ibanity.apis.client.products.ponto_connect.models.read.OrganizationFinancialInstitutionReadQuery;
import com.ibanity.apis.client.products.ponto_connect.models.read.OrganizationFinancialInstitutionsReadQuery;

public interface FinancialInstitutionService {

    FinancialInstitution find(FinancialInstitutionReadQuery financialInstitutionReadQuery);

    FinancialInstitution find(OrganizationFinancialInstitutionReadQuery organizationFinancialInstitutionReadQuery);

    IbanityCollection<FinancialInstitution> list(OrganizationFinancialInstitutionsReadQuery organizationFinancialInstitutionsReadQuery);

    IbanityCollection<FinancialInstitution> list(FinancialInstitutionsReadQuery financialInstitutionsReadQuery);
}
