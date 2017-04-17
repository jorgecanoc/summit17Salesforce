/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Sun Apr 16 12:59:17 EDT 2017
 */
package com.redhat.salesforce.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist DeliveryInstallationStatus__c
 */
public enum Opportunity_DeliveryInstallationStatusEnum {

    // Completed
    COMPLETED("Completed"),
    // In progress
    IN_PROGRESS("In progress"),
    // Yet to begin
    YET_TO_BEGIN("Yet to begin");

    final String value;

    private Opportunity_DeliveryInstallationStatusEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static Opportunity_DeliveryInstallationStatusEnum fromValue(String value) {
        for (Opportunity_DeliveryInstallationStatusEnum e : Opportunity_DeliveryInstallationStatusEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}