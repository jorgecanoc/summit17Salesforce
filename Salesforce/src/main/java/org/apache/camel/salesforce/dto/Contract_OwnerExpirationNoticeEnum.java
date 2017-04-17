/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist OwnerExpirationNotice
 */
public enum Contract_OwnerExpirationNoticeEnum {

    // 120
    _120("120"),
    // 15
    _15("15"),
    // 30
    _30("30"),
    // 45
    _45("45"),
    // 60
    _60("60"),
    // 90
    _90("90");

    final String value;

    private Contract_OwnerExpirationNoticeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static Contract_OwnerExpirationNoticeEnum fromValue(String value) {
        for (Contract_OwnerExpirationNoticeEnum e : Contract_OwnerExpirationNoticeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}