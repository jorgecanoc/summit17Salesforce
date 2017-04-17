/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist StepStatus
 */
public enum ProcessInstanceStep_StepStatusEnum {

    // Approved
    APPROVED("Approved"),
    // Fault
    FAULT("Fault"),
    // Held
    HELD("Held"),
    // NoResponse
    NORESPONSE("NoResponse"),
    // Pending
    PENDING("Pending"),
    // Reassigned
    REASSIGNED("Reassigned"),
    // Rejected
    REJECTED("Rejected"),
    // Removed
    REMOVED("Removed"),
    // Started
    STARTED("Started");

    final String value;

    private ProcessInstanceStep_StepStatusEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static ProcessInstanceStep_StepStatusEnum fromValue(String value) {
        for (ProcessInstanceStep_StepStatusEnum e : ProcessInstanceStep_StepStatusEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}