/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist TemplateStyle
 */
public enum EmailTemplate_TemplateStyleEnum {

    // formalLetter
    FORMALLETTER("formalLetter"),
    // freeForm
    FREEFORM("freeForm"),
    // newsletter
    NEWSLETTER("newsletter"),
    // none
    NONE("none"),
    // products
    PRODUCTS("products"),
    // promotionLeft
    PROMOTIONLEFT("promotionLeft"),
    // promotionRight
    PROMOTIONRIGHT("promotionRight");

    final String value;

    private EmailTemplate_TemplateStyleEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static EmailTemplate_TemplateStyleEnum fromValue(String value) {
        for (EmailTemplate_TemplateStyleEnum e : EmailTemplate_TemplateStyleEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}