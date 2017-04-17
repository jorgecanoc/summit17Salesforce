/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist RecurrenceRegeneratedType
 */
public enum Task_RecurrenceRegeneratedTypeEnum {

    // RecurrenceRegenerateAfterDueDate
    RECURRENCEREGENERATEAFTERDUEDATE("RecurrenceRegenerateAfterDueDate"),
    // RecurrenceRegenerateAfterToday
    RECURRENCEREGENERATEAFTERTODAY("RecurrenceRegenerateAfterToday"),
    // RecurrenceRegenerated
    RECURRENCEREGENERATED("RecurrenceRegenerated");

    final String value;

    private Task_RecurrenceRegeneratedTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static Task_RecurrenceRegeneratedTypeEnum fromValue(String value) {
        for (Task_RecurrenceRegeneratedTypeEnum e : Task_RecurrenceRegeneratedTypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}