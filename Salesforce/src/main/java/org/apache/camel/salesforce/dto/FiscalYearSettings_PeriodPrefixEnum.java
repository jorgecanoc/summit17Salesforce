/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist PeriodPrefix
 */
public enum FiscalYearSettings_PeriodPrefixEnum {

    // FP
    FP("FP"),
    // Month
    MONTH("Month"),
    // P
    P("P"),
    // Period
    PERIOD("Period");

    final String value;

    private FiscalYearSettings_PeriodPrefixEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static FiscalYearSettings_PeriodPrefixEnum fromValue(String value) {
        for (FiscalYearSettings_PeriodPrefixEnum e : FiscalYearSettings_PeriodPrefixEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}