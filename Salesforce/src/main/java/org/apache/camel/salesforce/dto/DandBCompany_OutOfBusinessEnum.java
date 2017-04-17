/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist OutOfBusiness
 */
public enum DandBCompany_OutOfBusinessEnum {

    // N
    N("N"),
    // Y
    Y("Y");

    final String value;

    private DandBCompany_OutOfBusinessEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static DandBCompany_OutOfBusinessEnum fromValue(String value) {
        for (DandBCompany_OutOfBusinessEnum e : DandBCompany_OutOfBusinessEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}