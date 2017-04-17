/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist SmallBusiness
 */
public enum DatacloudDandBCompany_SmallBusinessEnum {

    // N
    N("N"),
    // Y
    Y("Y");

    final String value;

    private DatacloudDandBCompany_SmallBusinessEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static DatacloudDandBCompany_SmallBusinessEnum fromValue(String value) {
        for (DatacloudDandBCompany_SmallBusinessEnum e : DatacloudDandBCompany_SmallBusinessEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}