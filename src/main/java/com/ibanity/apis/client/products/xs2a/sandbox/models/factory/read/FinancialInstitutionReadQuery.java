package com.ibanity.apis.client.products.xs2a.sandbox.models.factory.read;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Builder
@ToString
@EqualsAndHashCode
public class FinancialInstitutionReadQuery {
    private UUID financialInstitutionId;
}
