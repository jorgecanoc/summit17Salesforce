/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist RecurrenceInstance
 */
public enum Holiday_RecurrenceInstanceEnum {

    // First
    FIRST("First"),
    // Fourth
    FOURTH("Fourth"),
    // Last
    LAST("Last"),
    // Second
    SECOND("Second"),
    // Third
    THIRD("Third");

    final String value;

    private Holiday_RecurrenceInstanceEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static Holiday_RecurrenceInstanceEnum fromValue(String value) {
        for (Holiday_RecurrenceInstanceEnum e : Holiday_RecurrenceInstanceEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}