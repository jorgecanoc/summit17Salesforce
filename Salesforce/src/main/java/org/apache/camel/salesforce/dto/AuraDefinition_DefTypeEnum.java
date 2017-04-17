/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist DefType
 */
public enum AuraDefinition_DefTypeEnum {

    // APPLICATION
    APPLICATION("APPLICATION"),
    // COMPONENT
    COMPONENT("COMPONENT"),
    // CONTROLLER
    CONTROLLER("CONTROLLER"),
    // DESIGN
    DESIGN("DESIGN"),
    // DOCUMENTATION
    DOCUMENTATION("DOCUMENTATION"),
    // EVENT
    EVENT("EVENT"),
    // HELPER
    HELPER("HELPER"),
    // INTERFACE
    INTERFACE("INTERFACE"),
    // MODEL
    MODEL("MODEL"),
    // PROVIDER
    PROVIDER("PROVIDER"),
    // RENDERER
    RENDERER("RENDERER"),
    // STYLE
    STYLE("STYLE"),
    // SVG
    SVG("SVG"),
    // TESTSUITE
    TESTSUITE("TESTSUITE"),
    // TOKENS
    TOKENS("TOKENS");

    final String value;

    private AuraDefinition_DefTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static AuraDefinition_DefTypeEnum fromValue(String value) {
        for (AuraDefinition_DefTypeEnum e : AuraDefinition_DefTypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}